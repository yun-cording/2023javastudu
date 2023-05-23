package day03.com.ict.edu2;

public class test04 {
public static void main(String[] args) {
	// 카페모카 6500원이다.
	// 친구와 둘이서 15000원을 내고 주문했다.
	// 잔돈은 얼마 인가? (단, 부가세 10%포함)
	
	//String coff = "카페모카" ;
	int dan = 6500 ;
	int su = 2 ;
	int in = 15000 ;
	int total = dan * su ;
	int vat = total / 10 ; // 부가세 구하는 방법은 다양하다
	//int vat2 = (int) (total * 0.1) ; // 부가세 구하는 방법은 다양하다
	int out = in - (total + vat) ;
	
	System.out.println("잔돈 : " + out) ;
	
	// 위 정보를 한번에 처리
	int out2 = in - (int)(total * 1.1);
	System.out.println("잔돈 : " + out2);
	
	//===================================================
	
	int moca = 6500;
	int sum = 15000;
	int p = 2 ;
	moca = (moca += moca/10)*p ;
	int res = sum - moca;
	
	
	System.out.println("잔돈은 : " + res);
}
}
