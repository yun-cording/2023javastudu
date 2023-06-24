package network.multichat.copy;

import java.io.IOException;
import java.util.ArrayList;

public class ChatRoom {
	// 방 참여자들이 저장되어 있는 곳 - 방 나가기 또는 접속 해제 시 여기서 삭제 되어야 한다.
	//						마지막 사람이 나가면 방은 삭제 해야한다.
	
	ArrayList<CopyClient> j_list; // CopyClient객체들으 받는 어레이리스트 배열 생성
	String title; // 방 제목
	
	public ChatRoom(String title) { // ChatRoom 생성자
	j_list = new ArrayList<>(); // 스트링형 타이틀 이름들을 받아서 j_list에 저장하
	this.title = title; 		// 저장한내용을 전역어레이리스트 title에 저장
	}
	
	
	// 방 제목을 반환하는 기능(ChatServer에서 호출해서 사용함)
	public String getTItle() {
		return title;
	}
	
	
	// 방 참여자들의 수를 반환하는 기능
	public int getJoinCount() {
		return j_list.size(); //  //j_list어레이리스트배열에 있는 CopyClient 크기만큼 즉 사용자들 있는 만큼 반환
	}
	
	// 방 참여하는 메서드
	public void join(CopyClient cc) {
		j_list.add(cc);
		
		// 방 참여자에게 메세지 전달 ( 대기실 인원들한테는 전달 안되도록)
		Protocol p = new Protocol();
		p.setCmd(4);	//4:방참여
		p.setMsg("--" + cc.nickName + "님 입장--");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
			
	// 방 참여 명단을 반환하는 기능을 하는 메서드
	public String[] getJoinUsers() {
		String[] arr = new String[j_list.size()]; // CopyClient크기만큼 즉 사용자들 만큼 크기의 String배열생성
		int i = 0;
		for (CopyClient k : j_list) { //j_list어레이리스트배열에 있는 CopyClient 수 만큼
			arr[i++] = k.nickName; // arr스트링 배열에 닉네임정보들을 넣어둠
		}		
		return arr; // 그후 닉네임 정보들을 반환
	}
	
	// 방안에사람들과 채팅할수 있게해주는 메서드 생성
		public void sendProtocol(Protocol p) { //프로토콜정보를 받아오기위해 매개변수로 프로토콜 받음
			for (CopyClient k : j_list) { //카피클라이언트라는 객체를 k로 받아서f for문으로 전체내용 입력
				try {
					k.out.writeObject(p);
					k.out.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	// 방나가는 기능을 하는 메서드
	public void getOut(CopyClient cc) { // 매개변수로 copyclient 받아서 cc로
		j_list.remove(cc); // 어레이리스트 배열에서 매개변수로 받은 cc를 제거
		
		
		// 프로토콜 객체 생성해서 방안 사람들한테 나간사람 내용 알려주기위한 기능들
		Protocol p = new Protocol();
		p.setCmd(1);
		p.setMsg("--" + cc.nickName + "님 나가셨습니다.--");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
}