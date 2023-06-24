package network.com.ict.edu7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.net.ssl.SSLContext;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	// 현재 클라이언트가 참여하고 있는 방의 정보
	ChatRoom c_room = null; // null이면 어떤 방에도 참여하지 않고 있는 상태

	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());

		} catch (Exception e) {

		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch(p.getCmd()) {
					case 0:		//0:종료
						// 현재 방에 참여하고 있는 상태인지 확인
						if(c_room != null) {
							outRoom();
						}
						out.writeObject(p);
						out.flush();
						break esc;
					case 1:		//1:메세지  닉네임받아서
						p.setMsg(nickName+" : " + p.getMsg());
						c_room.sendProtocol(p);
						break;
					case 2:		//2:접속 및 갱신
						nickName = p.getMsg();
						// 현재 대기실의 명단을 수집한다.
						p.setNames(server.getUserName());
						// 방 제목 수집
						p.setRooms(server.getRoomName());
						server.sendMsg(p);
						server.refresh();
						break;
					case 3:		//3:방만들기
						c_room = new ChatRoom(p.getMsg());
						// 만든 사람이 방에 들어가기
						c_room.join(this);
						//대기실에서는 삭제
						server.removeClient(this);
						// 서버에는 만든 방 추가
						server.addRoom(c_room);
						//대기실 갱신
						server.refresh();
						break;
					case 4:		//4:방참여
						// r_index를 이용해서 방 객체 가져오기
						c_room = server.getRoom(p.getR_index());
						// 방 들어가기
						c_room.join(this);
						//대기실에서 나오기
						server.removeClient(this);
						server.refresh();
						break;
					case 5:		//5:방나가기
						// 대기실
						outRoom();
						// 대기실에는 인원 추가
						server.refresh();
						//대기실 자기 자신 추가
						server.addClient(this);
						
						
						break;
					case 6:		//6:쪽지보내기
						CopyClient client = server.c_list.get(p.getC_index());
						String msg = p.getMsg();
						p.setMsg(nickName+"님 쪽지 :  \n" + msg);
						
						// 선택된 사람에게 보내기(C_index 위치에 있는 사람)
						client.out.writeObject(p);
						out.flush();
						break;
					
					}					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while문 무한반복 끝
		server.removeClient(this);
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // run 끝
	
	// 방 나가기 메서드 만들기
	private void outRoom() {
		c_room.getOut(this);
		int cnt = c_room.getJoinCount();
		if(cnt == 0 ) {
			server.removeRoom(c_room);
		}
		c_room = null;
	}
}
