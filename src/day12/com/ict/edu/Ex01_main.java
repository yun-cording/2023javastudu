package day12.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01_method coffee = new Ex01_method();
		coffee.name = "커피음료";
		coffee.price = 1000;

		Ex01_method ion = new Ex01_method();
		ion.name = "이온음료";
		ion.price = 1500;

		Ex01_method cola = new Ex01_method();
		cola.name = "탄산음료";
		cola.price = 1200;

		Ex01_method juice = new Ex01_method();
		juice.name = "과일음료";
		juice.price = 1800;

		Ex01_method[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = scan.nextInt();
		// 음료들의 최소금액을 구하자 . (오름차순에서 맨 처음 최소값 , 맨 끝이 최대값)
		// Arrays.sort(arr);
		while(true) {
		if (input < 1000) {
			System.out.println("가난한 녀석 , 안 돼 돌아가!");
			System.out.println("다시 가져가 " + input); break;
		} else {
			System.out.println("1.커피\t2.이온\t3.탄산\t4.과일");
			// 음료 금액과 각 음료수의 가격을 비교
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].price <= input) {
					System.out.print("O\t");
				} else if(arr[j].price> input){
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.println("선택하세요 >> ");
			String drink = scan.next();
			
			int output = 0;
			switch (drink) {
			case "커피":
				output = input - arr[0].price;
				break;
			case "이온":
				output = input - arr[1].price;
				break;
			case "탄산":
				output = input - arr[2].price;
				break;
			case "과일":
				output = input - arr[3].price;
				break;
			default:
				System.out.println("잘못 선택하셨습니다");
				output = input;
			}
			System.out.println("잔돈 : " + output);

		}
		}
	}
}
