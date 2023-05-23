package day03.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		// 산술 연산자 : + - * / %(나머지)
		int su1 = 9;
		int su2 = 4;
		int result = 0; // 결과값을 받기위한 변수 처음엔 아무것도없으니 0을 넣어줌
		result = su1 + su2;
		System.out.println("결과 : " + result);

		result = su1 - su2;
		System.out.println("결과 : " + result);
		
		result = su1 * su2;
		System.out.println("결과 : " + result);
		
		result = su1 / su2;
		System.out.println("결과 : " + result);
		
		double res = su1 % su2 ;
		System.out.println("결과 : " + res);
		
		res = (double)su1 / su2; //정수형을 실수형으로 바꾸는 캐스팅의 여러 방법
		System.out.println("결과 : " + res);
		
		res = 1.0 * su1/su2 ; //정수형을 실수형으로 바꾸는 캐스팅의 여러 방법
		System.out.println("결과 : " + res);
		
		res = su1 / (su2*1.0);	//정수형을 실수형으로 바꾸는 캐스팅의 여러 방법
		System.out.println("결과 : " + res);
		
		result = su1 % su2;
		System.out.println("결과 : " + result);
		
	}
}
