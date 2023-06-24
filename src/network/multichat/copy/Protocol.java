package network.multichat.copy;

import java.io.Serializable;

public class Protocol implements Serializable { // 프로토콜 클래스를 serializable로 직렬화함
	/*
	 *  직렬화: 데이터를 Stream 으로 전송할 수 있는 상태로 만든다 (ex. 파일)
	 * 	역직렬화: Stream 으로 전송 받은 데이터를 객체로 만든다
	 * 객체를 파일에 쓴다라는 말은 다른말로 하면 객체를 스트림으로 만든다. 다른말로 객체의 직렬화라고도 함.
	  이렇게 객체를 직렬화 해서 쓰러면 Serializable 인터페이스를 구현한 클래스로 만든 객체여야한다.
		
	 * Serializable의 인터페이스를 보면 메소드가 하나도 없다. 아무런 구현해야 할 메소드도 없는 이 인터페이스가 있는 이유란?	 * 
	 * 개발을 하다 보면 아래와 같은 경우가 존재합니다. 생성한 객체를 파일로 저장할 일이 있을 수도 있습니다. 저장한 객체를 읽을 일이 생길
	 * 수도 있습니다. 다른 서버에서 생성한 객체를 받을 일도 생길 수 있습니다.
	 * 
	 * 이럴 때 꼭 필요한 것이 Serializable 입니다. 우리가 만든 클래스가 파일에 읽거나 쓸 수 있도록 하거나, 다른 서버로 보내거나
	 * 받을 수 있도록 하려면 반드시 이 인터페이스를 구현해야 합니다. Serializable 인터페이스를 구현하면 JVM에서 해당 객체는
	 * 저장하거나 다른 서버로 전송할 수 있도록 해준다. 자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도
	 * 사용할 수 있도록 바이트(byte) 형태로 데이터 변환하는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술(역직렬화)을 아울러서
	 * 이야기합니다.
	 * 
	 * 그래서 직렬화를 왜 하는가?
	 * 직렬화를 하는 이유는 사용하고 있는 데이터를 파일 저장 혹은 데이터 통신에서 파싱할 수 있는 유의미한 데이터를 만들기 위함이다.
	 * 여기서는 데이터 통신에서 파싱할수 있는 유의미한 데이터를 만들기위해 직렬화를 했다.
	 */
	
	// 0 : 종료 , 1:메세지 , 2:접속 및 갱신 , 3:방만들기 , 4:방참여 , 5:방나가기 , 6:쪽지보내기
	int cmd;
	String msg;
	
	String[] names; // 접속자 명단 배열
	String[] rooms; // 방 목록 스트링배열

	int u_count , r_index , c_index ; // 유저수 , 방정보 , 

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public String[] getRooms() {
		return rooms;
	}

	public void setRooms(String[] rooms) {
		this.rooms = rooms;
	}

	public int getU_count() {
		return u_count;
	}

	public void setU_count(int u_count) {
		this.u_count = u_count;
	}

	public int getR_index() {
		return r_index;
	}

	public void setR_index(int r_index) {
		this.r_index = r_index;
	}

	public int getC_index() {
		return c_index;
	}

	public void setC_index(int c_index) {
		this.c_index = c_index;
	}
}
