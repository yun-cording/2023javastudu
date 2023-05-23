package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex09_Constructor[] arr = new Ex09_Constructor[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			String name = scan.next();

			System.out.println("국어 : ");
			int kor = scan.nextInt();

			System.out.println("영어 : ");
			int eng = scan.nextInt();

			System.out.println("수학 : ");
			int math = scan.nextInt();
			Ex09_Constructor t1 = new Ex09_Constructor(name, kor, eng, math);
			arr[i] = t1;
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				else if (arr[i].getSum() < arr[j].getSum())
					arr[i].setRank(arr[i].getRank() + 1);
			}
		}

		// 정렬
		Ex09_Constructor arr1 = new Ex09_Constructor();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getRank()<arr[j].getRank()) {
					arr1 = arr[i];
					arr[i] = arr[j];
					arr[j]=arr1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}

	}
}
