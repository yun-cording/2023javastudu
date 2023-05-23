package day06.com.ict.edu;

public class Ex02_do_while {

	public static void main(String[] args) {
		/*
		 * do ~ while문 : while문과 같은 반복문 단 , 먼저 실행 후 조건식이 붙는다. 형식) 초기식 ; do{ 실행문; 증감식;
		 * }while(조건식);
		 * 
		 */

		// 0 ~ 10 까지 출력
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 11);

		// 0 ~ 10까지 홀수 출력
		i = 0;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		} while (i < 11);

		// 7단 출력
		i = 1;
		do {
			System.out.println("7 * " + i + " = " + (7 * i));
			i++;
		} while (i < 10);

		// 0 ~ 10 홀수의 누적합
		i = 1;
		int res = 0;
		do {
			if (i % 2 == 1) {
				res = res + i;
			}
			i++;
		} while (i < 10);
		System.out.println(res);

	}
}
