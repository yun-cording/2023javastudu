package day03.com.ict.edu2;

public class retest4 {

	public static void main(String[] args) {
		// 카페모카 6500원이다. 아메리카노는 4500원이다.
		// 친구와 둘이서 15000원을 내고 카페모카 1개 아메리카노 1개 주문했다.
		// 잔돈은 얼마 인가? (단, 부가세 10%포함)
		int a1 = 1 ;
		int m1 = 1 ;
		
		int moca = 6500 ;
		int ame = 4500 ;
		int money = 15000 ;
		int order = moca*a1 + ame*m1 ;
		int res = order += order/10 ;
		
		int rest = money - res ;
		System.out.println("잔돈은 :"+rest);
		
		
		

	}

}
