package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 수 받기
		System.out.print("학생수를 입력하세요");
		int students = sc.nextInt();
		int num = 0;
		int kor = 1;
		int eng = 2;
		int math = 3;
		int[][] arr = new int[students][8];
		// 키보드로 번호 , 국어 , 영어 , 수학
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == num) {
					System.out.print("번호를 입력하세요 : ");
					arr[i][num] = sc.nextInt();
				} else if (j == kor) {
					System.out.print(arr[i][num] + "번 학생 국어 점수 : ");
					arr[i][kor] = sc.nextInt();
				} else if (j == eng) {
					System.out.print(arr[i][num] + "번 학생 영어 점수 : ");
					arr[i][eng] = sc.nextInt();
				} else if (j == math) {
					System.out.print(arr[i][num] + "번 학생 수학 점수 : ");
					arr[i][math] = sc.nextInt();
				}


			}
		}
		int sum = 4;
		int avg = 5;
		int hak = 6;
		int rank = 7 ;
		// 총점4 , 평균5 ,학점6 , 순위(초기값지정)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == sum) { // 총점 구하는식
					arr[i][sum] = arr[i][kor] + arr[i][eng] + arr[i][math];
				} else if (j == avg) { // 평균 구하는 식
					arr[i][j] = (int) ((arr[i][sum] / 3.0) * 10 / 10.0);
				} else if (j == hak) { // 학점 구하는 식
					if (arr[i][avg] >= 90) {
						arr[i][hak] = 'A';
					} else if (arr[i][avg] >= 80) {
						arr[i][hak] = 'B';
					} else if (arr[i][avg] >= 70) {
						arr[i][hak] = 'C';
					} else if (arr[i][avg] >= 60) {
						arr[i][hak] = 'D';
					} else if (arr[i][avg] < 60) {
						arr[i][hak] = 'F';
					}
				}

			}
			arr[i][rank] = 1; // 순위값 초기값 지정
		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][sum] == arr[j][sum]) {
					continue;
				} else if (arr[i][sum] < arr[j][sum]) {
					arr[i][rank]++;
				}
			}
		}

		// 순위로 오름차순 정렬
		int[] tmp = new int[8];
		// 순위로 오름차순 다중 배열에선 sort 사용 불가능해서 이중 for문 사용
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
				if (arr[i][rank] > arr[j][rank]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t순위\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][num] + "\t");
			System.out.print(arr[i][kor] + "\t");
			System.out.print(arr[i][eng] + "\t");
			System.out.print(arr[i][math] + "\t");
			System.out.print(arr[i][sum] + "\t");
			System.out.print((double) arr[i][avg] + "\t");
			System.out.print((char) arr[i][hak] + "\t");
			System.out.print(arr[i][rank] + "\t");
			System.out.println();
		}

		// 출력

	}
}