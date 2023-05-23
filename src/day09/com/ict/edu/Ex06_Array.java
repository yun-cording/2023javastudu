package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {

		// 정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int su = sc.nextInt();

		// 입력받은 인원수 만큼 미리 배열을 만든다.
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] math = new int[su];
		int[] eng = new int[su];

		int[] rank = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		// 이름 , 국어 , 수학 , 영어 값 입력받기
		for (int i = 0; i < su; i++) {
			System.out.print((i + 1) + "번 이름 : ");
			name[i] = sc.next();
			System.out.print((i + 1) + "번 국어 : ");
			kor[i] = sc.nextInt();
			System.out.print((i + 1) + "번 수학 : ");
			math[i] = sc.nextInt();
			System.out.print((i + 1) + "번 영어 : ");
			eng[i] = sc.nextInt();
		}

		System.out.println();
		for (int i = 0; i < math.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else if (avg[i] >= 60) {
				hak[i] = "D학점";
			} else {
				hak[i] = "F학점";
			}
			rank[i] = 1; // 여기서 순위 초기값 지정
		}
		// 순위 출력
		for (int j = 0; j < rank.length; j++) {
			for (int i = 0; i < rank.length; i++) {
				if (i == j) {
					continue; // 여기서 효율적으로 코드를 작성하려면 continue 코드를
				} else if (sum[i] < sum[j]) {// 먼저 짬으로써 밑에 코드가 생략되서
					rank[i]++; // 좀더 효율적으로 작동하게 된다.
				}
			}
		}

		System.out.println("============");
		for (int i = 0; i < rank.length; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.print("총점 : " + sum[i]);
			System.out.println();
			System.out.print(String.format("평균 : " + "%.1f", avg[i]));
			System.out.println();
			System.out.print("학점 : " + hak[i]);
			System.out.println();
			System.out.println("순위 : " + rank[i]);
			System.out.println("============");
		}
	}
}
