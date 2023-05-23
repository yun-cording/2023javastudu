package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while 문 : for 문과 같은 반복문
		// 형식1)
		// 초기식 ;
		// while(조건식){
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while 문의 끝을 만나면 조건식으로 간다.

		// 형식2)
		// 초기식 ;
		// while(true){
		// if(빠져나갈 조건) {
		// break;
		// }
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while 문의 끝을 만나면 조건식으로 간다.

		// 1 - 10 까지 출력하자

		int i = 7;
		while (i < 8) {
			System.out.println(i + "단");
			int j = 1;
			while (j < 10) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
		// ===========================================================
		// 형식 1
		int y = 1;
		while (y < 11) {
			System.out.println("y = " + y);
			y++;
		}
		// ===========================================================
		// 형식 2
		int t = 1;
		while (true) {
			if (t >= 11)
				break;
			System.out.println("t = " + t);
			t++;
		}
		// ===========================================================
		// 누적합
		int sum = 0;
		t = 1;
		while (t < 11) {
			sum = sum + t;
			t++;
		}
		System.out.println(sum);
		// ===========================================================
		// 0 ~ 10까지 짝수 출력
		int h = 1;
		sum = 0;
		while (h < 11) {
			if (h % 2 == 0) {
				sum = sum + h;
			}
			h++;
		}
		System.out.println(sum);
		// ===========================================================
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		int k = 1;
		while (k < 5) {
			int n = 1;
			while (n < 5) {
				System.out.print("0 ");
				n++;
			}
			System.out.print("\n");
			k++;
		}
		// ===========================================================
		int b = 1;
		while (b < 10) {
			int n = 1;
			while (n < 10) {
				if (n % 2 == 0) {
					System.out.print("★ ");
				} else {
					System.out.print("☆ ");
				}
				n++;
			}
			System.out.println();
			b++;
		}
	}
}
