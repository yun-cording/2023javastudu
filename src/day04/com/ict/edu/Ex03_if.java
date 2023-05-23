package day04.com.ict.edu;

public class Ex03_if {

	public static void main(String[] args) {
		// 단순 if 문 : 조건식이 참일 때만 실행 , 거짓이면 if 문 무시
		
		// 형식) if (조건식){
		//			조건식이 참일때 실행할 문장 ;
		//			조건식이 참일때 실행할 문장 ;
		// }
		// 단 , 실행문장이 한줄이면 {} 블록을 생략할 수 있다.
		
		// 형식) if(조건식) 조건식이 참일때 실행할 문장 ;
		
		// 형식) if(조건식) 
		//		조건식이 참일때 실행할 문장 ;
		
		// int k1 이 60이상이면 합격
		int k1 = 59 ;
		String res = "초기값" ;
		if(k1 >= 60) { res = "합격입니다";}
		if(k1<60) res = "불합격입니다";
		
		System.out.println(res);
		
		// int k2가 홀수 인지 짝수인지 판별하기.
		int k2 = 6;
		res = "짝수";
		if (k2%2==1) { res ="홀수";
		}
		System.out.println(res);
		
		char c1 = 'Z' ;
		res = "대문자";
		if (c1>='a' &&c1 <='z') { res="소문자";
		}
		System.out.println(res);
		
//		근무시간이 8시간까지는 시간당 9620원 이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10이다. 
//		얼마를 받아야 하는가?
		
		int t= 10 ;
		int limt = 8 ;
		int pay = 9620 ;
		int ot = (int)(pay*1.5) ;
		int res1 = 0 ;
		
		res1 = pay*t ;
		
		if (t>limt) {
			res1 = pay*limt + ot*(t-limt)
					;			
		}
		
		System.out.println(res1);
		
		
		
		
	}

}
