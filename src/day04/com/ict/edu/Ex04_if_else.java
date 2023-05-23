package day04.com.ict.edu;

public class Ex04_if_else {

	public static void main(String[] args) {
		// if ~ else 문
		// 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식 if(조건식) {
		// 조건식이 참일 때 실행할 문장 ;
		// 조건식이 참일 때 실행할 문장 ;
		// }else{
		// 조건식이 거짓일 때 실행할 문장;
		// 조건식이 거짓일 때 실행할 문장;
		// }

		// int k1 이 60이상이면 합격 아니면 불합격
		int k1 = 59;
		String res = "";
		if (k1 >= 60) {
			res = "합격입니다";
		} else {
			res = "불합격입니다";
		}
		System.out.println(res);
		
		//int k2 가 홀수 인지 , 짝수인지 판별하자
		int k2 = 3;
		String res2 = "";
		if (k2%2==0) {
			res2 = "짝수입니다";
			} else {
				res2 = "홀수입니다";
			}
		System.out.println(res2);
		
		//char k3가 대문자인지 , 대문자가 아닌지 판별하자
		char c1 = 'z';
		String res3 = "";
		if (c1<='z'&&c1>='a') {
			res3 = "소문자입니다" ;
			} else {
				res3 = "대문자입니다";
			}
		System.out.println(res3);
		
//		근무시간이 8시간까지는 시간당 9620원 이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10이다. 
//		얼마를 받아야 하는가?		
		int t = 9 ;
		int dan = 9620;
		int money = 0;
		int li = 8 ;
		if (t<=8) {
			money = dan*t;			
		} else {
			money = (int)(dan*(t-li)*1.5) + dan*li;
		}
		System.out.println(money+"원받아야합니다.");
	}
}
