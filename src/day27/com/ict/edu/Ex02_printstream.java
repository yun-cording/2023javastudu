package day27.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream은 모든 데이터를 출력할수 있음
// 기본생서자가 없어서 BufferedStream 처럼 FileStream을 이용해야 한다.


public class Ex02_printstream {
	public static void main(String[] args) {
		String pathname = "C:\\util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null ;
		BufferedOutputStream bos =null;
		PrintStream ps = null ;
		try {
			// 체인방식 : 위에걸 밑으로 연결해서쓰고 위에것을 밑으로 연결되어있는 구조
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps =new PrintStream(bos);
			
			ps.print('a');
			ps.println("안녕 오랜나의 사랑아");
			ps.println("하루종일 이별 준비야");
			ps.println("널떠난뒤가 막연했기에");
			ps.println(7.665);
			ps.println(false);
			System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}try {
			bos.close();
			fos.close();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
