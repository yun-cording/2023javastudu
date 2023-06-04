package day28.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// OutputStreamWriter : 바이트 스트림을 문자스트림으로 변경 
//즉, 컴퓨터가 알아들을수있는 바이티 스트림을 사람이 볼수있는 문자스트림으로 변경
// OutputStream(바이트스트림) => OutputStreamWriter => BufferedWriter(문자스트림) 

// InputStreamReader : 바이트 스트림을 문자스트림으로 변경
// InputStream => InputStreamReader => BufferedReader

public class Ex02_OutputStreamWriter {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
//			System.out.println("원하는 문자 : ");
			// 모니터에 정보를 내보내자
			osw = new OutputStreamWriter(System.out); //System.out 모니터로 정보를 보낸다
			bw = new BufferedWriter(osw); // 버퍼라이터를 통해서
			bw.write("원하는 문자 : "); // 모니터로 보낼 문자 작성
			bw.flush();
			
			isr = new InputStreamReader(System.in); // System.in 키보드에서 들어오는 정보를 받아라
			br = new BufferedReader(isr); // 버퍼리더를 통해서
			String msg = br.readLine(); // readline 한줄씩
			// 받은 정보 출력
			bw.write("받은문자 : " + msg);
			bw.flush();
						
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				osw.close();
				bw.close();
				isr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}