package network.multichat.copy;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import day03.com.ict.edu2.retest1;

public class ChatServer implements Runnable {
	ServerSocket ss ;
	ArrayList<CopyClient> c_list; // copyclient란 객체를 값으로 받는 배열을 만듬. 접속자(대기자)의 정보를 저장하는 곳
	ArrayList<ChatRoom> r_list; // 대화방을 저장하는 곳 chatroom이란 객체를 값으로 받는 배열을 만듬.

	public ChatServer() {
		c_list = new ArrayList<>();
		r_list = new ArrayList<>();
		
		try {
			ss = new ServerSocket(7779);
			System.out.println("서버 대기중...");
			new Thread(this).start(); // 쓰레드 생성후 start 실행해줬으니 run 메소드로 이동
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void run() {
		while(true) {
			try {
				Socket s = ss.accept(); // 소켓을 생성 후 무한반복되는 while문 안에 ss.accept을 써서 계속 요청을 받아들인다. Socket은 try / catch가 필요
				 CopyClient cc = new CopyClient(s,this); // copyclient에서 소켓과 chatserver의 정보를 받는다.
				 cc.start(); // copyclient의 런 메소드로 이동
				 c_list.add(cc);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	// 대기실에 있는 모든 접속자에게 메세지 전달기능
	public void sendMsg(Protocol p) {
		for (CopyClient k : c_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
			}
		}
	}
	
	// 방 목록에 방 추가
	public void addRoom(ChatRoom room) {
		r_list.add(room);
	}
	
	// 인트형 index 받아서 r_list로 부터 방 객체 하나를 리턴해줌
	public ChatRoom getRoom(int index) {
		return r_list.get(index);
	}
	
	// 대기실 명단에서 삭제하는 기능 ( 방생성했거나 방에 들어갔을 경우)
	public void removeClient(CopyClient cc) {
		c_list.remove(cc);
		refresh();
	}
	
	// 대기실 목록 갱신하는 기능 ( 방목록 & 대기실 대기자 명단)
	public void refresh() {
		Protocol p = new Protocol();	//프로토콜 생성해서
		p.setCmd(2);	// 2번기능인 접속 및 갱신 세팅
		p.setNames(getUserName()); // 대기실 대기자 명단 갱신
		p.setRooms(getRoomName()); // 방목록 갱신
		
		// 대기실에 대기자들한테 갱신된 목록들 전달
		sendMsg(p);	
	}
	
	// 대기실 명단 갱신
	public String[] getUserName() {
		String[] arr = new String[c_list.size()];// 스트링 배열을 CopyClient크기만큼 즉 로그인한사람 수만큼의크기로만듬
		int i = 0;
		for (CopyClient k : c_list) {
			arr[i++] = k.nickName;	// 스트링배열 arr에 copyclient 닉네임들을 저장		
		}
		return arr; // 닉네임한것들으 돌려줌
	}
	
	// 방 목록 갱신
	public String[] getRoomName() {
		String[] arr = new String[r_list.size()];// 스트링 배열을 ChatRoom크기만큼 즉 만든 방의 수만큼 저장
		int i = 0;
		for (ChatRoom k : r_list) {
			arr[i++] = k.getTItle();	// 스트링배열 arr에 ChatRoom 방 이름들을 저장		
		}
		return arr; // 방 이름들 돌려줌
	}
	
	//
	public void addClient(CopyClient cc) {
		c_list.add(cc); // 대기실의 대기자 명단에 추가하고 
		refresh(); // 대기실 목록 갱신
	}
	
	//방 삭제하는 기능
	public void removeRoom(ChatRoom c_room) { // ChatRoom을 매개변수로 받아서
		r_list.remove(c_room); // 대화방 리스트에서 대화방에 아무도 안들어가있는방을 삭제
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
