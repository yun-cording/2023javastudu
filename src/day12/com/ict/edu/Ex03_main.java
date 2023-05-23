package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();
		coffee.setName("커피음료");
		coffee.setPrice(1000);

		Ex03_get_set ion = new Ex03_get_set();
		ion.setName("이온음료");
		ion.setPrice(1500);
		Ex03_get_set cola = new Ex03_get_set();
		cola.setName("탄산음료");
		cola.setPrice(1200);
		Ex03_get_set juice = new Ex03_get_set();
		juice.setName("과일음료");
		juice.setPrice(1800);
		Ex03_get_set[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = scan.nextInt();
		// 음료들의 최소금액을 구하자 . (오름차순에서 맨 처음 최소값 , 맨 끝이 최대값)
		// Arrays.sort(arr);
		
		if (input < 1000) {
			System.out.println("가난한 녀석 , 안 돼 돌아가!");
			System.out.println("다시 가져가 " + input);
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
		
		}
	}
}
