package day11.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class test02_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 이름, 국어, 영어, 수학를 받아서 총점, 평균, 학점, 순위를 구하고 순위
		 * 기준으로 오름차순으로 정렬하여 출력하는 main 메서드를 가지는 클래스를 만들어라 단, 처리는 2차원배열을 이용해라
		 */
		System.out.println("숫자를 입력하세요 : ");
		int su = scan.nextInt();

		test02_method[] arr = new test02_method[su];
			for (int j = 0; j < arr.length; j++) {
				test02_method arr1 = new test02_method();
				arr1.getName();
				arr1.getSum();
				arr1.getAvg();
				arr1.getHak();
				arr[j] = arr1;
				
		}
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j].sum+"\t");
				System.out.print(arr[j].avg+"\t");
				System.out.print(arr[j].hak+"\t");
				System.out.print(arr[j].rank+"\t");
			}
			System.out.println();
		}
		

//			test02_method arr1 = new test02_method();
//			test02_method[] arr2 = new test02_method[j];
//			arr1.getSum();
//			arr1.getAvg();
//			arr1.getHak();
//			arr1.rank = 1;
//			arr2[j] = arr1;
//			arr[su][j] = arr2[j];
		

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i][4] < arr[j][4]) {
//					arr[i][7]++;
//				}
//			}
//		}
//		test02_method[] tmp = new test02_method[8];
//		// 순위로 오름차순 다중 배열에선 sort 사용 불가능해서 이중 for문 사용
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				// 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
//				if (arr[i][7] > arr[j][7]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j]+"\t");
//				System.out.print(arr[i][j]+"\t");
//				System.out.print(arr[i][j]+"\t");
//				System.out.print(arr[i][j]+"\t");
//				System.out.print(arr[i][j]+"\t");
//				System.out.print(arr[i][j]+"\t");
//				System.out.println(arr[i][j]+"\t");
//			}
//		}

}
}
