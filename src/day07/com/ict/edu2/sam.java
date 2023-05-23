package day07.com.ict.edu2;

import java.util.Scanner;

public class sam {
	public static void main(String[] args) {
		// 예 홍길동 => 홍*동 , 선우은숙 => 선**숙
		String a8 = "김수한무거북이";
		int t1 = a8.length();
		String res = "";
		for (int i = 0; i < t1; i++) {
			char s = a8.charAt(i);
			if (i == 0 || i == t1 - 1) {

				res += s;

			} else {
				res += "★";
			}
		}
		System.out.println("결과 : " + res);
		System.out.println("====================================");
		// 전화번호 : 010-9876-7410 => 010 -9876-****으로 변경
		a8 = "010-9732-9110";
		int t2 = a8.length();
		int t3 = a8.lastIndexOf("-");
		res = "";
		for (int i = 0; i < t2; i++) {
			char a = a8.charAt(i);
			if (i >= 0 && i <= t3) {
				res += a;
			} else {
				res += "★";
			}
		}
		System.out.println("결과 : " + res);
		System.out.println("====================================");
		// 전화번호 : 010-9876-7410 => or 010-****-7410으로 변경
		a8 = "010-9732-9110";
		int t4 = a8.length();
		int t5 = a8.indexOf("-");
		int t6 = a8.lastIndexOf("-");
		res = "";
		for (int i = 0; i < t4; i++) {
			char a = a8.charAt(i);
			if (i > t5 && i < t6) {
				res += "★";
			} else {
				res += a;
			}
		}
		System.out.println("결과 : " + res);

	}
}
