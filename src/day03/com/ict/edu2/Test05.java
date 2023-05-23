package day03.com.ict.edu2;

public class Test05 {
public static void main(String[] args) {
	int su = 3781 ;
	// 결과
	// 천의자리 : 3
	// 백의자리 : 7
	// 십의자리 : 8
	// 일의자리 : 1
	int c = 0 ;
	int b = 0 ;
	int s = 0 ;
	int i = 0 ;
	int res = 0 ;
	
	c = su / 1000 ; // 3
	res = su % 1000 ; //781
	
	b = res / 100 ; // 7
	res = res % 100 ; //81
	
	s = res / 10 ;  // 8
	res = res % 10 ;  // 1
	
	i = res  % 10 ; // 1
	System.out.println("천의자리 : " + c);
	System.out.println("백의자리 : " + b);
	System.out.println("십의자리 : " + s);
	System.out.println("일의자리 : " + i);

	
	//===================================================
		
	
	int ch1 = su/1000 ;
	int ch2 = (su - (ch1*1000))/100 ;
	int ch3 = ((su-ch1*1000)-ch2*100)/10 ;
	int ch4 = (((su-ch1*1000)-ch2*100) - ch3*10) ;
	System.out.println("천의자리 : " + ch1);
	System.out.println("백의자리 : " + ch2);
	System.out.println("십의자리 : " + ch3);
	System.out.println("일의자리 : " + ch4);
	
	
}
}
