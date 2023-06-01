package day25.com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args) {
		String pathname = "C:\\Users\\zdbst\\Desktop\\수업내용메모/exam01.txt";
		File file = new File(pathname);
		
		try {
			boolean res = file.createNewFile();
			if(res) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패(기존에 같은 이름에 파일이 존재)");
			}
			System.out.println("=========================");
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("상대경로 : " + file.getPath());
			System.out.println("파일이름 : " + file.getName());
			System.out.println("=========================");
			
			File file2 = new File("C:\\Users\\zdbst\\Desktop\\수업내용메모/Exam/aaa");
			// 중간에 디렉토리가 하나라도 없으면 만들어 지지 않는다.
//			boolean res2 = file2.mkdir();
			// 한번에 여러개의 디렉토리를 만들 수 있다. mkdir과의 차이
			// 중간에 디렉토리가 없어도 만들어진다.
			boolean res2 = file2.mkdirs();
			if(res2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패(기존에 같은 이름의 디렉토리가 존재)");
			}
			System.out.println("=========================");
			
			// 파일 삭제
			pathname= "C:\\Users\\zdbst\\Desktop\\수업내용메모/exam01.txt";
			File file3 = new File(pathname);
			boolean res3 = file3.delete();
			if(res3) {
				System.out.println("파일삭제 성공");
			}else {
				System.out.println("파일삭제 실패");
			}
			System.out.println("=========================");
			// 디렉토리 삭제
			File file4 = new File("C:\\Users\\zdbst\\Desktop\\수업내용메모/Exam/aaa");
			boolean res4 = file.delete();
			if(res4) {
				System.out.println("디렉토리 삭제 aaa 성공");
				File file5 = new File("C:\\Users\\zdbst\\Desktop\\수업내용메모/Exam");
				boolean res5 = file5.delete();
				if(res5) {
					System.out.println("디렉토리 EXAM 삭제 성공");
				}
				else {
					System.out.println("디렉토리 EXAM 삭제 실패");
				}
			}else {
				System.out.println("디렉토리 aaa 삭제 실패");
			}
			
			System.out.println("=========================");
			
			
		} catch (IOException e) {
			System.out.println("위치가 틀렸습니다."); 
		}
	}
}
