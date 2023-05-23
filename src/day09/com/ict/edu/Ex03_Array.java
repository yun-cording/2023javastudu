package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {
		// 정렬하기 오름차순
		int[] su = { 3, 5, 4, 6, 7, 8, 9, 1, 10, 0 };

		// 자리 변경을 위한 임시변수 필요
		int tmp = 0;

		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// 비교하기 (오름 (i>j), 내림 (i<j) 괄호방향에 따라 달라짐
				if (su[i] < su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		System.out.println("==============================");
		int[] su2 = { 3, 5, 4, 6, 7, 8, 9, 1, 10, 0 };

		// Arrays 클래스는 배열 복사 , 정렬 , List 로 전환 등
		// 배열에 관련된 기능을 제공하는 클래스
		// 오름차순 정렬은 sort()로 가능
		// 내림차순은 없음
		Arrays.sort(su2);
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println();
		System.out.println("==============================");
		// 내림 차순 정리할땐 Integer로 선언하고 Collections.reverseOrder()하면 사용가능
		Integer[] su3 = { 3, 5, 4, 6, 7, 8, 9, 1, 10, 0 };
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
		
	}
}
