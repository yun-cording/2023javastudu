package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	이름, 국어, 영어, 수학를 입력 받아서 
//	총점, 평균, 학점을 구하고 
//	이름, 총점, 평균, 학점을 출력하는 코딩 
//	(평균은 소숫점 첫째자리까지 구하자)
		
		System.out.print("이름은 :");
		String name = scan.next();

		System.out.print("국어점수 :");
		int kor = scan.nextInt();

		System.out.print("영어점수 :");
		int eng = scan.nextInt();

		System.out.print("수학점수 :");
		int math = scan.nextInt();

		int sum = kor + eng + math;
		double avg = (int)(sum / 3.0 * 10) / 10.0;
		
		String hak = "";
		
		if(avg>=90) {
			hak = "A학점";
		}else if (avg>=80) {
			hak = "B학점";
		}else if (avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
				
		System.out.println("이름 :" + name + " 총점 : " + 
		sum + " 평균 : " + avg + "학점 : " + hak);
	}
}
