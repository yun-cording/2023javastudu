package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
	Socket s ;
	ChatServer server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	public CopyClient(Socket s , ChatServer server) {
		this.s = s;
		this.server = server;
		
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					// 원격에 있는 실제 클라이언트에게 종료메세지보냄
				out.println("~~byte"); 
				break;	
				}
				server.sendMsg(ip+" : "+msg);
			} catch (Exception e) {
			}
		}// while문 종료지점
				try {
					out.close();
					in.close();
					s.close();
					
					// server에 있는 list에 현재 객체 삭제
					server.removeClient(this); //리스트에서 삭제하는 메서드 만들어야함
					server.sendMsg(ip + "님 퇴장"); //sendMsg는 전체한테 메세지보내는용도
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
}