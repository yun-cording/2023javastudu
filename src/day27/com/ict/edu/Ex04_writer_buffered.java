package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 문자 출력 스트림
// File Output Stream => 1byte 처리 , write(아스키코드) , write(byte[] b)
// FileWriter		  => 2byte 처리 , write(String str);

// BufferedWriter : newLine() => 줄바꿈 기능

public class Ex04_writer_buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw =null;
		try {
			String pathname = "C:\\util/ex01.txt";
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			
			// 내용
//			String msg = "안녕하세요\nHello\nBongjure";
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("123453");
			bw.newLine();
			bw.write("HDFLzxc");
			
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}