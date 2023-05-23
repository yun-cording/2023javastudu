package day09.com.ict.edu;

public class Ex10_Array {
	public static void main(String[] args) {
		// 가변길이 첫번째 길이는 정해져 있지만 나머지 길이가 정해져 있지 않은 것

		int[][] su = new int[3][];

		// int[][] su2 = new int[][]; 불가능
		// int[][] su3 = new int[][4]; 불가능

		// 초기값을 고정길이 방식으로 주면 안됨(오류발생)
//		su[0][0] = 10;
//		su[0][1] = 10;
//
//		su[1][0] = 10;
//		su[1][1] = 10;
//
//		su[2][0] = 10;
//		su[2][1] = 10; 	고정길이 방식은 오류 발생

		// 가변 길이는 무조건 1차원 배열을 만들어서 넣어야 한다.

		int[] k1 = { 10, 20, 30 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000, 3000, 4000 };

		// 위에서 만든 배열을 다차원 배열에 넣어라.
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("========================================");
		// 선언 , 생성 , 저장 한번에
		String[][] str = { { "java", "자바", "잡아봐" }, { "jsp" }, { "HTML", "CSS", "python", "django" } };
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}

		
	}
}