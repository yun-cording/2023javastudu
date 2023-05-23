package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	// static{
	// 초기화 내용
	// }

	int s1 = 100;
	private int p1 = 100;
	static int s2;
	
	public static int k1 = 300;
	static int k2 = 100;
	private static int k3 = 100;
	
	// 생성자 : 인스턴스 초기화목적
	
	static {
//		m1 = 1000;
		m2 = 1000;
		s2 = 1000;
		k2 = 1000;
	}
	
	public Ex03_static() {
		s1 = 200 ;
		m1 = 200 ;
		s2 = 400 ;
		s3 = 500 ;
		m2 = 1000;
	}
	int s3 ;
	static int m1 ;//초기값이없으니 위에서 넣어줌
	static int m2 = 500 ;
	// 초기값이 있어서 위에서 설정한 값이 500으로 바뀜

}