package day11.com.ict.edu;

import java.util.Scanner;

public class Sam_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5명의 이름 , 국어 , 영어 , 수학을 입력 받아서
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];

		Sam_method sam = new Sam_method();
		// 이름 , 총점 , 평균 , 학점 구하고
		for (int i = 0; i < hak.length; i++) {
			System.out.println("이름 : ");
			name[i] = scan.next();

			System.out.println("국어 : ");
			kor[i] = scan.nextInt();

			System.out.println("영어 : ");
			eng[i] = scan.nextInt();

			System.out.println("수학 : ");
			math[i] = scan.nextInt();

			// 총점
			sum[i] = sam.getSum(kor[i], eng[i], math[i]);
			// 평균
			avg[i] = sam.getAvg(sum[i]);
			// 학점
			hak[i] = sam.getHak(avg[i]);
		}
			
		// 출력하기
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]);
		}
	}
}
