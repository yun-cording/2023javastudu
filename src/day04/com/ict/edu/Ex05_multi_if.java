package day04.com.ict.edu;

public class Ex05_multi_if {
	
	public static void main(String[] args) {
		// 다중 if 문
		// 형식) if(조건식1){
		// 조건식 1이 참일때 실행할 문장;
		// 조건식 1이 참일때 실행할 문장;
		// }else if(조건식2){
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// 조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		// }else if(조건식3){
		// 조건식1,2은 거짓이면서 조건식3가 참일때 실행할 문장;
		// 조건식1,2은 거짓이면서 조건식3가 참일때 실행할 문장;
		// }else{
		// } 조건1,2,3 모두 거짓인경우

		// int k1의 점수가 90이상이면 A학점 , 80이상이면 B학점 , 70이상이면 C학점,나머지 F
		int k1 = 98;
		if (k1 >= 90) {
			System.out.println("A학점");
		} else if (k1 >= 80) {
			System.out.println("B학점");
		} else if (k1 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

		// char k2가 대문자인지 , 소문자인지 ,슷자인지 , 기타문자인지 판별하자

		char k2 = 128;
		if (k2 >= 'a' && k2 <= 'z') {
			System.out.println("소문자입니다");
		} else if (k2 >= 'A' && k2 <= 'Z') {
			System.out.println("대문자입니다");
		} else if (k2 <= 127 && k2 >= 0) {
			System.out.println("숫자입니다");
		} else {
			System.out.println("기타문자");
		}
//==============================================================
		char c2 = 'g';
		String res = "";
		if (c2 >= 'a' && c2 <= 'z') {
			res = "소문자";
		} else if (c2 >= 'A' && c2 <= 'Z') {
			res = "대문자";
		} else if (c2 >= '0' && c2 <= '9') {
			res = "숫자";
		} else {
			res = "기타문자";
		}
		System.out.println("결과 : " + res);

		// char k3이 A,a 이면 아프리카 , B,b이면 브라질 , C,c이면 캐나다 , 나머지는 한국

		char k3 = 't';
		if (k3 == 'A' || k3 == 'a') {
			System.out.println("아프리카");
		} else if (k3 == 'B' || k3 == 'b') {
			System.out.println("브라질");
		} else if (k3 == 'C' || k3 == 'c') {
			System.out.println("캐나다");
		} else {
			System.out.println("한국");
		}
// ==============================================================
		char k4 = 't';
		if (k4 == 'A' || k4 == 'a') {
			res = "아프리카";
		} else if (k4 == 'B' || k4 == 'b') {
			res = "브라질";
		} else if (k4 == 'C' || k4 == 'c') {
			res = "캐나다";
		} else {
			res = "한국";
		}
		// menu가 1이면 카페모카 3500 , 2이면 카페라떼 4000 , 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능

		int menu = 2;
		int p = 3;
		int moca = (int) (3500 * 1.1);
		int latte = (int) (4000 * 1.1);
		int americano = (int) (3000 * 1.1);
		int fruit = (int) (3500 * 1.1);
		int money = 14000;
		int res1 = 0;
		String order = "";
		if (menu == 1) {
			res1 = money - p * moca;
			order = "카페모카";
			System.out.println(order + " 주문 " + "잔돈은 " + res1 + "원입니다.");
		} else if (menu == 2) {
			res1 = money - p * latte;
			order = "카페라떼";
			System.out.println(order + " 주문 " + "잔돈은 " + res1 + "원입니다.");
		} else if (menu == 3) {
			res1 = money - p * americano;
			order = "아메리카노";
			System.out.println(order + " 주문 " + "잔돈은 " + res1 + "원입니다.");
		} else if (menu == 4) {
			res1 = money - p * fruit;
			order = "과일쥬스";
			System.out.println(order + " 주문 " + "잔돈은 " + res1 + "원입니다.");
		} else {
			System.out.println("주문 안했습니다");
		}
// ==============================================================
		int menu1 = 3 ;
		int in1 = 10000 ;
		int su1 = 2 ;
		int dan1 = 0 ;
		String drink1 = "";
		
		if(menu1 == 1 ) {
			drink1 = "카페모카";
			dan1 = 3500;
		}else if (menu1 == 2) {
			drink1 = "카페라떼";
			dan1 = 4000;
		}else if (menu1 == 3) {
			drink1 = "아메리카노";
			dan1 = 3000;
		}else if (menu1 == 4) {
			drink1 = "과일쥬스";
			dan1 = 3500;
		}
		int total1 = dan1 * su1 ;
		int vat = (int)(total1*0.1) ;
		int out1 = in1 - (total1+vat) ;
		System.out.println("선택메뉴 : "+drink1);
		System.out.println("잔돈 : "+ out1);
// ==============================================================
//	int a = -2 ;
//	int b = 3 ;
//	int c = 0 ;
//	int d = 2 ;
//	int e = -5 ;
//	String res ="";
//	if (a+b+c==5) {
//		System.out.println("a,b,c학생은 삼총사입니다");
//		}else if(a+b+d==5) {
//			System.out.println("a,b,d학생은 삼총사입니다");
//		}else if(a+b+e==5) {
//			System.out.println("a,b,e학생은 삼총사입니다");
//		}else if(b+c+d==5) {
//			System.out.println("b,c,d학생은 삼총사입니다");
//		}else if(b+c+e==5) {
//			System.out.println("b,c,e학생은 삼총사입니다");
//		}else if(c+d+e==5) {
//			System.out.println("c,d,e학생은 삼총사입니다");
//		}
	}

}
