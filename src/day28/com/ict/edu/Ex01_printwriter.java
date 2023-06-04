package day28.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintStream : 1byte 처리 , 모든 데이터 출력할 수 있음. ( System.out.print())
//				BufferedStream 처럼 OutputStream을 이용해서 사용 ( 체인방식)

// PrintWriter : OutputStream(바이트출력) , Writer(문자출력) 둘 다 사용 가능 

public class Ex01_printwriter {
	public static void main(String[] args) {
		String pathname = "C:\\util/test01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			// 체인방식
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter 연습");
			pw.print(1234);
			pw.print('A');
			pw.print(false);
			pw.print(177.94);
		} catch (Exception e) {

		}finally {
			try {
				fw.close();
				pw.close();
				bw.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
