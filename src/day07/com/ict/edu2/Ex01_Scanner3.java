package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요 (1.yes , 2.no ) 일때 Ex01_Scanner는 숫자로 받았는데
		// 문자가 들어왼 오류 발생 된다.
		// 그래서 문자로 받아서 처리하자
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
				while (true) {
					System.out.println("계속할까요? (1.Y(y) , 2. N(n) >>");
					String su3 = scan.next();
					if (su3.equalsIgnoreCase("y")) {
						continue esc;
					} else if (su3.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("제대로 입력하세요");
						continue;
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