package day11.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06_method t = new Ex06_method();
		// 5명의 , 이름 , 국어 , 영어 , 수학을 입력 받아서
		// 이름 , 총점 , 평균 , 학점  출력 하자 메인에서
		// 입력 받기
		Scanner scan = new Scanner(System.in);
		String[] name = t.name;
		int[] kor = t.kor;
		int[] eng = t.eng;
		int[] math = t.math;
		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요:");
			name[i] = scan.next();
			System.out.print("국어 점수는 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 점수는 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 점수는 : ");
			math[i] = scan.nextInt();
		}
		t.setName(name);
		t.setKor(kor);
		t.setEng(eng);
		t.setMath(math);
		
		// 총점 구하기
		t.setSum();
		// 평균 구하기
		t.setAvg();
		// 학점 구하기
		t.setHak();
		// 출력하기
		t.setPrn();
	}
}
