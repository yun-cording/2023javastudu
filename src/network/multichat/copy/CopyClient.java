package network.multichat.copy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class CopyClient extends Thread {
	Socket s ;
	ChatServer server;
	ObjectInputStream in; // 오브젝트 = 객체를 받는 스트림
	ObjectOutputStream out; // 객체를 보내는 아웃풋 스트림
	String nickName; // 닉네임 받아두는 스트링
	// 현재 클라이언트가 참여하고 있는 방의 정보
		ChatRoom c_room = null; //chatRoom사용을위해 객체 생성 및 null이면 어떤 방에도 참여하지 않고 있는 상태
	public CopyClient(Socket s , ChatServer server) {
	this.s = s;
	this.server = server;
	try {
		in = new ObjectInputStream(s.getInputStream()); // 소켓을 통해 정보를 받은걸 in에 넣음
		out = new ObjectOutputStream(s.getOutputStream()); // 소켓을 통해 정보를 받은걸 out에 넣음
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	@Override
	public void run() {
		esc:while(true) {
			try {
				Object obj = in.readObject(); // obj에 오브젝트인풋스트림을통해 읽은 정보를 넣어둠
				if(obj != null) { // 받은정보가 있을경우에 !
					Protocol p = (Protocol)obj; // obj의 정보를 프로토콜 p에 넣어둠
					switch(p.getCmd()) {
					// 0 : 종료 , 1:메세지 , 2:접속 및 갱신 , 3:방만들기 , 4:방참여 , 5:방나가기 , 6:쪽지보내기
					case 0:
						if(c_room != null) { // 방에 아무도 참여하고 있으면 
							outRoom(); // 방을 나가는 메서드
						}
						out.writeObject(p); // 
						out.flush();
						break esc; // 레이블을 통해 무한루프 탈출
					case 1: // 1: 메세지
						p.setMsg(nickName+" : " + p.getMsg()); // 닉네임이랑 받은 메세지를 setMsg에 저장
						c_room.sendProtocol(p); // chatRoom에 방안에 사람들과 채팅할수 있는 sendProtocol메서드 생성
						break;
					case 2: // 접속 및 갱신
						nickName = p.getMsg(); //프로토콜에서 받은 메세지를 닉네임에 저장
						// 현재 대기실의 명단을 수집한다. 
						p.setNames(server.getUserName()); //ChatRoom에 만든 getUserName으로 수집
						// 방 제목 수집
						p.setRooms(server.getRoomName()); //ChatRoom에 만든
						//모두에게 전달
						server.sendMsg(p);
						break;
					case 3:	// 방 만들기
						c_room = new ChatRoom(p.getMsg());
						//만든사람은 방에 바로 들어가기
						c_room.join(this);
						// 방에 들어갔으니 대기실에서는 삭제하는 기능
						server.removeClient(this); // this를 사용해서 방만들고 들어간 본인을 대기실 명단에선 삭제
						// 서버에서 만든 방 추가
						server.addRoom(c_room);
						// 대기실 갱신
						server.refresh();
						break;
					case 4: // 방 참여
						// r_index를 이용해서 방 객체 가져오기
						c_room = server.getRoom(p.getR_index());
						// 방 들어가기
						c_room.join(this);
						// 대기실에서 나오기
						server.removeClient(this);
						break;
					case 5: // 방 나가기 기능
						outRoom(); // 방 나가는 메서드 실행
						server.addClient(this); // 자기자신 대기실 명단에 추가하고 업데이트하는 기능실행
						break;
					case 6: //쪽지보내기
						CopyClient client = server.c_list.get(p.getC_index());// CopyClient 객체 생성
						String msg = p.getMsg(); // 프로토콜에 세팅되어있는 메세지 받아줄 스트링형 msg 선언
						p.setMsg(nickName + "님 쪽지 : \n" + msg);
						
						//선택된 사람에게 보내기 (c_index 위치에 있는 사람한테)
						client.out.writeObject(p);
						client.out.flush();						
						break;
						
					}
				}
			} catch (Exception e) {
			}
		} // while문 끝 
		server.removeClient(this); // while문 탈출했다는것은 0번 종료 누르고 나왔다는걸로 이제 기록삭제 및 소켓닫아줌
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
		}
	} // run 메서드 끝
	
	// 방나가는 메서드 outRoom 생성
	private void outRoom() {
		c_room.getOut(this); // chatRoom에 getOut이라는 방나가는 메서드 만들고 CopyClient를 매개변수로 보냄
		int cnt = c_room.getJoinCount(); //c.room에 j_list에 CopyClient사용자들 있는만큼 int형 cnt에 넣음
		if(cnt == 0 ) {
			server.removeRoom(c_room); // 방에 사람이 아무도 없을때 방을 제거
		}
		
		Protocol p = new Protocol(); // 프로토콜 객체 생성
		p.setCmd(5); // 프로토콜5번 방나가기
		p.setNames(c_room.getJoinUsers()); //방을 나갔을경우 참여자 명단을 반환하는 기능 실행 
		c_room.sendProtocol(p); // 방 채팅창에 메세지 입력
	}
}
