package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//스레드 처리
public class EchoServer2 implements Runnable{
	
		ServerSocket ss = null;
		Socket s = null;
		
		InputStream in = null;
		BufferedInputStream bis = null;
		
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		public EchoServer2() {
			try {
				ss = new ServerSocket(7778);
				System.out.println("서버 대기중...");
				new Thread(this).start();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					s = ss.accept();
					String ip = s.getInetAddress().getHostAddress();
					in = s.getInputStream();
					bis = new BufferedInputStream(in);
					
					out = s.getOutputStream();
					bos = new BufferedOutputStream(out);
					
					byte[] b = new byte[1024];
					bis.read(b);
					
					String msg = new String(b).trim();
					
					bos.write(msg.getBytes());
					bos.flush();
					
				} catch (Exception e) {
					
				}finally {
					try {
						in.close();
						bis.close();
						out.close();
						bos.close();
						ss.close();
						s.close();
					} catch (Exception e2) {

					} 
					
				}
			}
			
		}
	

	public static void main(String[] args) {
		new EchoServer2();
	}




}
