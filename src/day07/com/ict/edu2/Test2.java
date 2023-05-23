package day07.com.ict.edu2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:
		while(true) {
			String sample = "";
			System.out.println("이름을 입력하세요 : ");
			String name = scan.next();
			for(int i =1 ; i<name.length();i++) {
				char n1 = name.charAt(i);
				String a1 ="";
				String a2 = a1.replace(n1,'★');
				
			}			
			System.out.println("계속하시겠습니까? (y)/(n)");
			String an = scan.next();
			String an1 = "y";
			String an2 = "n";
			if(an.equals(an1)) {}
			else if(an.equals(an2)) {
				break;
			}else {
				while (true) {
					System.out.println("잘못입력하셨습니다."
							+ " 계속하시겠습니까? (y),(n) >>");
					an = scan.next();
					if (an.equals(an2)) {
						break esc;
					} else if (an.equals(an1)) {
						break;
					}
				}
			}
		}
		
	}
}
