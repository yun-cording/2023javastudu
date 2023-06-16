package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 implements Runnable {
	Socket s = null;
	OutputStream out = null;
	BufferedOutputStream bos = null;
	
	InputStream in = null;
	BufferedInputStream bis = null;
	Scanner scan = new Scanner(System.in);
	
	
	public EchoClient2() {
		new Thread(this).start();
		
	}
		
	public void run() {
		while(true) {
			try {
				System.err.print("데이터 입력 : ");
				String msg = scan.next();
				
				s = new Socket("192.168.0.16" , 7778);
				
				// 출력
				out = s.getOutputStream();
				bos = new BufferedOutputStream(out);
				bos.write(msg.getBytes());
				bos.flush();
				
				//입력
				in = s.getInputStream();
				bis = new BufferedInputStream(in);
				byte[] b = new byte[1024];
				bis.read(b);
				
				String str = new String(b).trim();
				if(str.equals("exit")) break;
				
				System.out.println("서버에서 받은 내용 : " + str);
				
				
			} catch (Exception e) {
			}finally {
				try {
					s.close();
					out.close();
					bos.close();
					in.close();
					bis.close();
				} catch (Exception e2) {

				}
			}
		}
		
	}
	
public static void main(String[] args) {
	new EchoClient2();
}

}
