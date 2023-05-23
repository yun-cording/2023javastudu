package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		double count3 = 0;
		double count4 = 0;
		esc: while (true) {
			System.out.println("숫자 입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				count++;
			} else {
				str = "홀수";
				count1++;
			}
			System.out.println(su + "는 " + str + "입니다.");
			System.out.print("계속할까요?(1.yes , 2. no) >> ");
			int su2 = scan.nextInt();
			if (su2 == 2) {
				break;
			} else if (su2 == 1) {
			} else {
				while (true) {
					System.out.println("잘못입력하셨습니다. 1.yes , 2. no >>");
					int su3 = scan.nextInt();
					if (su3 == 2) {
						break esc;
					} else if (su3 == 1) {
						break;
					}
				}
			}
		}
		count3 = (count1 * 1.0) / (count + count1) * 100;
		count4 = (count * 1.0) / (count + count1) * 100;
		System.out.println("짝수 총 개수는 : " + count);
		System.out.println("홀수 총 입력 개수는 : " + count1);
		System.out.println("홀수가 나온 확률은 :" + count3 + "%");
		System.out.println("짝수가 나온 확률은 :" + count4 + "%");
	}
}
