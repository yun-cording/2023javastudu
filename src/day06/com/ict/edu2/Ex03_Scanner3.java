package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야하는가?
		// 근무시간 입력 받을것
		System.out.println("------------------------------------------");
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int si = 9620;
		System.out.print("근무시간 : ");
		int time = scan.nextInt();
		if (time <= 8) {
			money = time * si;
		} else if (time > 8) {
			money = si * 8 + (time - 8) * (int) (si * 1.5);
		}
		System.out.println(time + "시간일한 급여는 " + money + "원 입니다.");

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.)
		System.out.println("------------------------------------------");
		int p = 2;
		money = 10000;
		int don = 0;
		String order = "";
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>> ");
		int menu = scan.nextInt();
		for (int i = 0; true; i++) {
			if (menu == 1) {
				don = money - (int) ((p * 3500) * 1.1);
				order = "카페모카";
				break;
			} else if (menu == 2) {
				don = money - (int) ((p * 4000) * 1.1);
				order = "카페라떼";
				break;
			} else if (menu == 3) {
				don = money - (int) ((p * 3000) * 1.1);
				order = "아메리카노";
				break;
			} else if (menu == 4) {
				don = money - (int) ((p * 3500) * 1.1);
				order = "과일쥬스";
				break;
			} else
				System.out.print("다시입력 : ");
			menu = scan.nextInt();
		}

		System.out.println("선택한 메뉴는 : " + order + "이고 잔돈은 : " + don + "입니다.");

		// 나라를 입력하면 수도가 출력되게 하자.
		// 한국 -> 서울 , 중국 -> 베이징 , 일본 -> 도쿄 , 미국 -> 워싱턴
		// (switch~case)
		System.out.println("------------------------------------------");
		System.out.print("나라 : ");
		String nara = scan.next();
		String sudo = "";

		for (int i = 0; true; i++) {
			switch (nara) {
			case "한국":
				sudo = "서울";
				break;
			case "중국":
				sudo = "베이징";
				break;
			case "일본":
				sudo = "도쿄";
				break;
			case "미국":
				sudo = "워싱턴";
				break;
			default:
				System.out.println("다시입력하십시오");
				nara = scan.next();
			}
			System.out.println(nara + "의 수도는 " + sudo + "입니다.");
			break;
		}
	}
}
