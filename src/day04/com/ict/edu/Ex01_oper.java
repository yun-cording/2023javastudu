package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
// 삼항 연산자 : 조건식 => 조건이 참 일때와 거짓 일때를 구분해서 실행한다.
// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 : 조건식이 거짓일 때 실행할 문장;
// **주의사항 ) 변수, 참일때 실행 결과와 , 거짓일 때 실행할 결과 모두 같은 자료형이어야 한다.
// 조건식에는 boolean(true , false) , 비교연산자 , 논리연산자
		String str = (false) ? "강아지" : "고양이" ;
		System.out.println(str);
		
		int avg = 80 ;
		str = (avg > 60.5345344) ? "합격"	: "탈락"	; //실수와 정수 비교할수 있
		System.out.println("결과 : " + str);
		
		char c1 = 'z';
		str = c1 >= 'a' && c1 <= 'z' ?"소문자" : "아니다" ;
		System.out.println(str);
		
		int gender = 3;
		//1 또는 3이면 남자 아니면 여자
		str = gender ==1 || gender == 3 ? "남자" : "여자" ;
		System.out.println(str);
		
		//홀수이면 남자 , 짝수이면 여자로 판단
		gender = 0;
		str = gender%2 == 1 ? "남자" : "여자" ;
		System.out.println(str);
		
		// 3의 배수인지 아닌지 알아보자
		int su1 =531;
		str = su1%3==0 ? "3의배수입니다" : "아닙니다";
		System.out.println(str);
		
//		근무시간이 8시간까지는 시간당 9620원 이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10이다. 
//		얼마를 받아야 하는가?
		int worktime =10 ;
		int pay = 9620 ;
		int money = worktime>=0 && worktime<8 ? pay*worktime : (pay*8) + ((worktime-8) * (int)(pay*1.5)) ;
		System.out.println("일당은: " + money + "원 입니다.");
		//===============================================다른방법
		int pay1 = 9620;
		int worktime1 = 10;
		int pay_overtime = (int) (pay * 1.5);
		int over_pay = ((8 * pay1) + ((worktime - 8) * pay_overtime));
		int normal_pay = worktime * pay;
		int result = 0;

		result = (worktime1 > 8) ? over_pay : normal_pay;
		System.out.println(result);
		
		int num1 = 47 ;
		int num2 = 48 ;
		int res = num1>num2 ? num1 : num2 ;
		System.out.println("큰값 :" + res);
		
		int res2 = Math.max(num1, num2);//단점 2개의 수바께 비교못함
		System.out.println("큰 값:" + res2);
		
		int res3 = -384 ;
		int res4 = res3>0 ? res3 : -res3 ;
		System.out.println("결과 : " + res4);
		
		int res5 = Math.abs(-55182);
		System.out.println("결과 : " + res5);
	}
}
