package day05.com.ict.edu;

public class Ex01_switch {

	public static void main(String[] args) {
		/* switch ~ case : 다중 if ~ else 문과 같은 조건문
		 if문의 조건식은 boolean , 비교연산자 , 논리연산자 즉 , true , false일때 사용
		 switch문의 조건식은 int , char , String 일때 사용(long,float,double은 불가능)
		 형식) switch(인자값 = int, char ,String){
		 	case 조건값 1: 인자값과 조건값1이 같을 때 수행할 문장; break;
		 	case 조건값 2: 인자값과 조건값2이 같을 때 수행할 문장이 여러줄일때는;
		 	 		     인자값과 조건값2이 같을 때 수행할 문장; break; 마지막에 브레이크걸어주기
		 	case 조건값 3: 인자값과 조건값3이 같을 때 수행할 문장; break;
		 	default : 조건값 1,2,3 모두 같지 않을때 (나머지) 수행할문장; break; 
		 		}
		 		
		 		**주의사항 : break가 없으면 break를 만날때 까지 모든 실행문을 실행한다.
		 		break의 역활은 실행중인 범위{} 블록)을 벗어나는 역활을 한다.
		 		default는 생략가능하다.
		 */
		// int k1이 1이면 카페모카 ,2이면 카페라떼 ,3이면 아메리카노 ,4이면 과일쥬스를 출력하자
		int k1 = 1;
		String res = "";

		switch (k1) {
		case 1: res = "카페모카"; break;
		case 2: res = "카페라떼"; break;
		case 3: res = "아메리카노"; break;
		case 4: res = "과일쥬스"; break;
		default: res = "잘못주문하셨습니다."; break; 
		}
		System.out.println("결과 : " + res);
		System.out.println("==================================");
		
		//break가 없을 때 : 다음 break를 만날때까지 다음 수행을 실행한다.
		int k2 = 1;
		switch (k2) {
		case 1: System.out.println("결과 : 카페모카"); 
		case 2: System.out.println("결과 : 카페라떼"); 
		case 3: System.out.println("결과 : 아메리카노"); 
		case 4: System.out.println("결과 : 과일쥬스"); 
		System.out.println("==================================");
		}

		//char k3이 A , a 이면 아프리카 ,B ,b이면 브라질 C ,c이면 캐나다 나머지 한국
		// 결과물이 같은 것끼리 순서대로 배치하고 break 일부분을 없애면 or관계 작용되게 응용가능하다
		//	case 'A': 
		//	case 'a': 
		//	case '1': res ="아프리카"; break;
		
		char k3 = '2';
		switch (k3) {
		case 'A': 
		case 'a': 
		case '1': res ="아프리카"; break;
		case 'B': 
		case 'b': 
		case '2': res ="브라질"; break;
		case 'c': 
		case 'C': 
		case '3': res ="캐나다"; break;
		default: res="한국"; break;
		}
		System.out.println("결과 : " + res);
		System.out.println("==================================");
		
		// String k4가 한국이면 서울 , 중국이면 베이징 , 일본이면 도쿄
		String k4 = "일본";
		switch(k4) {
		case "한국": res="서울"; break;
		case "중국": res="베이징"; break;
		case "일본": res="도쿄"; break;
		}
		System.out.println(k4+"의 " + "수도는 "+res);
		System.out.println("==================================");
		
		// int k5 가 3~5봄 , 6~8여름 ,9~11가을 , 12~2 겨울
		int k5 = 5;
		switch(k5) {
		case 3:
		case 4:
		case 5: res="봄"; break;
		case 6:
		case 7:
		case 8: res="여름"; break;
		case 9:
		case 10:
		case 11: res="가을"; break;
		case 12:
		case 1:
		case 2: res="겨울"; break;
		}
		System.out.println("계절은: "+res);
		System.out.println("==================================");
		
		//switch에서 범위가 넓어지면 사용하지 말자(if문 사용하자)
		//int k6의 점수가 90이상이면 A학점 , 80학점이상이면 B학점 , C학점이상이면 C학점 , 나머지 F학점
		//이런식으로 활용가능
		int k6 = 100;
		switch ((int)(k6/10)) {
		case 10: res = "A학점";
		case 9: res = "A학점"; break;
		case 8: res = "B학점"; break;
		case 7: res = "C학점"; break;
		default: res = "F학점"; break;
		}		
		System.out.println("결과는 : " + res);
	}
}
