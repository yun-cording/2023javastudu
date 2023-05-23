package day03.com.ict.edu2;

public class retest5 {

	public static void main(String[] args) {
		// 결과
		// 천의자리 : 3
		// 백의자리 : 7
		// 십의자리 : 8
		// 일의자리 : 1
		
		int su = 8212 ;
		int res ;
		
		int c = su/1000 ;
		res = su % 1000 ; 
		
		int b = res / 100 ;
		res = res % 100 ;
		
		int s = res / 10 ;
		int i = res % 10 ;
		
		System.out.println("천의 자리:" + c);
		System.out.println("백의 자리:" + b);
		System.out.println("십의 자리:" + s);
		System.out.println("일의 자리:" + i);
		
		}

}
