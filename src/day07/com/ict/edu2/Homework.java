package day07.com.ict.edu2;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		// 전체 돌아간 횟수 , 그중에 짝수가 나온 퍼센트 구하기(소숫점 첫째자리까지)
		while (true) {
			System.out.print("숫자를 입력하세요 :");
			int su = scan.nextInt();
			count++;
			if (su % 2 == 0) {
				count1++;
			}
			System.out.print("계속하시겠습니까? 1.yes , 2.no : >>>");
			su = scan.nextInt();
			if (su == 1) {

			} else if (su == 2) {
				break;
			}

		}
		count1 = count / count1 * 100;
		System.out.println("총 돌아간 횟수 :" + count);
		System.out.println("그중 짝수가 나온 퍼센트 :" + count1 + "%");
	}
}
