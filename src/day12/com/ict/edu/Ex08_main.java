package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {

		Ex08_Constructor coffee = new Ex08_Constructor("커피음료", 1000);
		Ex08_Constructor ion = new Ex08_Constructor("이온음료", 1500);
		Ex08_Constructor cola = new Ex08_Constructor("탄산음료", 1200);
		Ex08_Constructor juice = new Ex08_Constructor("과일음료", 1800);
		
		Ex08_Constructor[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = scan.nextInt();
		// 음료들의 최소금액을 구하자 . (오름차순에서 맨 처음 최소값 , 맨 끝이 최대값)
		// Arrays.sort(arr);
		esc:
			while(true) {
		if (input < 1000) {
			System.out.println("가난한 녀석 , 안 돼 돌아가!");
			System.out.println("다시 가져가 " + input); break;
		} else {
			System.out.println("1.커피\t2.이온\t3.탄산\t4.과일");
			// 음료 금액과 각 음료수의 가격을 비교
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].getPrice() <= input) {
					System.out.print("O\t");
				} else if(arr[j].getPrice() > input){
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.println("선택하세요 >> ");
			String drink = scan.next();
			
			int output = 0;
			switch (drink) {
			case "커피":
				output = input - arr[0].getPrice();
				break;
			case "이온":
				output = input - arr[1].getPrice();
				break;
			case "탄산":
				output = input - arr[2].getPrice();
				break;
			case "과일":
				output = input - arr[3].getPrice();
				break;
			default:
				System.out.println("잘못 선택하셨습니다");
				output = input;
			}
			
			System.out.println("잔돈 : " + output);
			if(output>=1000) {
				System.out.println("더 마실래? Y/N");
			}
				String s = scan.next();
				if(s.equals("Y")) {
					continue esc;
				}else if(s.equals("N")) {	
					System.out.println("잔돈 : " + output);
					break;
			}else {
				System.out.println("잘못 눌렀어");
				System.out.println("더 마실래? Y/N");
			}
			}
		}
	}	
}
