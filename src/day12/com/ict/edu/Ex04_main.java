package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// int[] k1 = new int[];
		Ex04_get_set[] arr = new Ex04_get_set[5];

		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set();
			System.out.print("이름 : ");
			person.setName(scan.next());

			System.out.print("국어 : ");
			person.setKor(scan.nextInt());

			System.out.print("영어 : ");
			person.setEng(scan.nextInt());

			System.out.print("수학 : ");
			person.setMath(scan.nextInt());

			person.setSum(person.getKor() + person.getEng() + person.getMath());
			person.setAvg((int) (person.getSum() / 3.0 * 10) / 10.0);
			if (person.getAvg() >= 90) {
				person.setHak("A학점");
			} else if (person.getAvg() >= 80) {
				person.setHak("B학점");
			} else if (person.getAvg() >= 70) {
				person.setHak("C학점");
			} else {
				person.setHak("F학점");
			}
			person.setRank(1);
			arr[i] = person;
			// 그래서 String 은 클래스지만 기본자료형처럼 사용한다고 하는거에요
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				else if (arr[i].getSum() < arr[j].getSum())
					arr[i].setRank(arr[i].getRank()+1);
			}
		}

		// 정렬
		Ex04_get_set[] arr1 = new Ex04_get_set[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[arr[i].getRank()-1] = arr[i];
		}

		// 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i].getKor() + "\t");
			System.out.print(arr1[i].getEng() + "\t");
			System.out.print(arr1[i].getMath() + "\t");
			System.out.print(arr1[i].getSum() + "\t");
			System.out.print(arr1[i].getAvg() + "\t");
			System.out.print(arr1[i].getHak() + "\t");
			System.out.println(arr1[i].getRank());
		}
	}
}
