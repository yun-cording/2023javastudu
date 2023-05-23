package day05.com.ict.edu;

public class Test {
	public static void main(String[] args) {
		// =================================================
		// (1번) 1 + (-2) + 3 (-4) + 5 (-6) + 7 +(-8) + 9 + (-10)
		// for문을 이용한 누적합
		int s = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				s = s + (i * -1);
			} else
				s = s + i;
		}
		System.out.println(s);
		System.out.println("==================================");
		// =================================================
		// (2 번) - * if~ else문 사용
		// 농구공 5개씩 한 박스에 들어간다.
		// 40개면 8상자, 26개면 6개이다.

		int n = 8;
		int res = 0;
		if (n % 5 == 0) {
			res = n / 5;
		} else {
			res = n / 5 +1 ;
		}
		System.out.println(res + "상자");
		System.out.println("==================================");
		// =================================================
		// (3 번) - * for문으로 풀기
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("==================================");
		// =================================================
		// (4 번) - * 이중 for문으로 풀기
//		1 0 0 0
//		0 1 0 0
//		0 0 1 0
//		0 0 0 1
		char a = '0';
		char b = '1';
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if(i==j) {
					System.out.print(b+" ");
				}else{
					System.out.print(a+" ");
				}
			}
			System.out.println();
		}
		System.out.println("==================================");

		// =================================================
		// (5 번) - * for문
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
			int sum = 0;
			for (int i = 1; i<300; i++) {
				if (i % 2 == 1) {
					sum = sum + i ;
					if(sum==100) {
						System.out.println("합한결과:"+sum);
						System.out.println("마지막더한숫자는:"+i+"입니다");
					}
				} else { 
					sum = sum + (i * -1);
				}
			}
		System.out.println("==================================");
		// =================================================
		// (6 번) - * for문
		// *
		// * *
		// * * *
		// * * * *

		for (int k1 = 1; k1 < 5; k1++) {
			for (int j = 0; j < k1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("==================================");
		// =================================================
		// (7 번) - * for문
		//       *
		//     * *
		//   * * *
		// * * * *
		char a1 = '★';
		char b1 = ' ';
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j < 5; j++) {
				if (j >= i) {
					System.out.print(a1);
				} else {
					System.out.print(b1);
				}
			}
			System.out.println();
		}

//		System.out.println("==================================");
//	    System.out.println("5번 문제 번외 : ");
//
//	    int i_9 = 1;
//	    int sum_9 = 0;
//	   
//	    loop:
//	    for (i_9 = 1; i_9 <= 500; i_9++) {
//	        if (i_9 % 2 == 0) {
//	            sum_9 = sum_9 + (int)(i_9 * -1);
//	            }
//	        else 
//	            sum_9 = sum_9 + i_9; 
//	            if (sum_9 >= 100) {
//	                break loop;
//	            }
//	    }
//	    System.out.println("합한 결과는 : " + sum_9 + "입니다.");
//	    System.out.println("마지막 더한 숫자는 : " + i_9 + "입니다.");
		
	}
}
