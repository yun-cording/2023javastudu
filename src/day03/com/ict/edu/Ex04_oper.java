package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		//논리연산자 : &&(AND,논리곱), ||(OR, 논리합) , !(NOT,논리부정)
		//논리연산자의 연산 대상은 boolean 형
		//결과는 boolean 형 , 조건식에 사용
	
		// AND = && = 논리곱 = 교집합
		// 주어진 조건들이 모무 true 일때 결과는 true
		// 하나라도 false가 있다면 false로 나옴
		// false 이후는 연산하지 않는다.
		// **AND 조건을 이용하면 범위를 지정할 수 있다.
		// a >= 10 && a<=20 : a는 10~20까지의 범위를 지정한 것
		
		int su1 = 10 ; 
		int su2 = 7 ;
		char c1 = 'a';
		char c2 = 'A';
		boolean result ;
		
		result = (c1 >= c2 && c2 >= 60);
		System.out.println(result);
		
		result = (su1 <= su2 && c1 >= c2);
		System.out.println(result);
		
		result = (c1 >= su2 && c2 >= su1);
		System.out.println(result);
		
		result = (c1 >= c2 && c2 >= 60);
		System.out.println(result);
		
		result = (c1 >= c2 && c2 >= 60);
		System.out.println(result);
		
		System.out.println("=============================");
		
		result = ((su1 = su1 +2)) > su2 && (su1==(su2 = su2 + 5 ));		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1);
		System.out.println("결과 : " + su2);
		
		System.out.println("=============================");
		
		su1 = 10 ;
		su2 = 7 ;
		result = ((su1 = su1 +2)) < su2 && (su1==(su2 = su2 + 5 ));		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1);
		System.out.println("결과 : " + su2);
		//조건문에서 앞에 결과가 false이 떴으므로 &&연산자는 바로 실행을 멈추고
		//뒤에 조건을 실행하지 않음. 그로인해 밑에 결과물을 보면 앞에꺼만 계산되고
		//뒤에꺼 식은 계산되지않은채 변수에 저장됨
		System.out.println("=============================");
		//범위 지정
		int su3 = 34;
		//su3은 20~30사이에 존재하는 값이다.
		result = su3>=20 && su3<=40 ;
		System.out.println(result);
		
		// char c1이 소문자인지 확인하기
		char c3 = 'g';
		result = c3>='a' && c3<='z' ;
		System.out.println(result);
		
	}
}
