package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		// 5명의 이름 , 국어 , 영어 , 수학을 입력 받아서
		// 이름 , 총점 , 평균 , 학점 , 순위를 구하고
		// 순위 기준으로 오름차순 정렬해서 출력하자

		Scanner scan = new Scanner(System.in);
		// Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// int[] k1 = new int[];
		Ex08_method[] arr = new Ex08_method[5];

		for (int i = 0; i < arr.length; i++) {
			Ex08_method person = new Ex08_method();
			System.out.print("이름 : ");
			person.name = scan.next();

			System.out.print("국어 : ");
			person.kor = scan.nextInt();

			System.out.print("영어 : ");
			person.eng = scan.nextInt();

			System.out.print("수학 : ");
			person.math = scan.nextInt();

			person.sum = person.kor + person.eng + person.math;
			person.avg = (int) (person.sum / 3.0 * 10) / 10.0;
			if (person.avg >= 90) {
				person.hak = "A학점";
			} else if (person.avg >= 80) {
				person.hak = "B학점";
			} else if (person.avg >= 70) {
				person.hak = "C학점";
			} else {
				person.hak = "F학점";
			}
			person.rank = 1;
			arr[i] = person;
			// 그래서 String 은 클래스지만 기본자료형처럼 사용한다고 하는거에요
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				else if (arr[i].sum < arr[j].sum)
					arr[i].rank++;
			}
		}

		// 정렬
		Ex08_method[] arr1 = new Ex08_method[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[arr[i].rank - 1] = arr[i];
		}

		// 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i].kor + "\t");
			System.out.print(arr1[i].eng + "\t");
			System.out.print(arr1[i].math + "\t");
			System.out.print(arr1[i].sum + "\t");
			System.out.print(arr1[i].avg + "\t");
			System.out.print(arr1[i].hak + "\t");
			System.out.println(arr1[i].rank);
		}
	}
}
