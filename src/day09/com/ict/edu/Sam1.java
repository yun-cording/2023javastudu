package day09.com.ict.edu;

import java.util.Iterator;

public class Sam1 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		// 번호 , 총점 , 평균 , 학점 , 순위

		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 95, 'A', 1 };

		// 1차원 배열을 다차원배열 넣자
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue; // 자기자신 제외
				else if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 순위로 오름 정렬
//		int[][] t = new int[5][5];
//		for (int i = 0; i < t.length; i++) {
//			t[arr[i][4]-1] = t[i] ;
//		}
		int[] t = new int[5];
		// int[] t = {0,0,0,0,0}; 이렇게도 가능
		// 순위로 오름 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) { // 오름차순
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char) (arr[i][3]) + "\t"); // 학점 보기용 char형
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
