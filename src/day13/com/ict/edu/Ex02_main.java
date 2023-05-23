package day13.com.ict.edu;

public class Ex02_main {
public static void main(String[] args) {
	System.out.println(Ex02_static.su2);
	//객체 생성 상관없이 호출가능 
	Ex02_static p1 = new Ex02_static();
	System.out.println(p1.su1);
	System.out.println(p1.su2);
	System.out.println();
	
	Ex02_static p2 = new Ex02_static();
	System.out.println(p1.su1);
	System.out.println(p1.su2);
	System.out.println();
			
	Ex02_static p3 = new Ex02_static();
	System.out.println(p1.su1);
	System.out.println(p1.su2);
	System.out.println();
	// 3
	
	System.out.println(p1.su1);
	System.out.println(p1.su2);
	
	
}
}