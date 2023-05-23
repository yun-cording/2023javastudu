package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.4;
	
	// this() : 자기자신 생성자를 뜻한다.
	//			생성자의 첫번째줄에 있어야 다른 생성자 호출
//	public Ex01_Sub() {
//		this("홍두깨" , 14); // 밑에 생성자에 ()값을 넣음
		
//	}
	
	// super() : 부모클래스 생성자를 뜻한다.
	// 자식클래스 생성자 첫줄에 부모 클래스 생성자가 숨어있다.
	public Ex01_Sub() {
		this("kkk",14); // 숨어있는 부모클래스 기본생성자 super()
					//this를 쓰고싶은경우 생성자를 하나더 만들어서 이런식으로 이용
	}
	
	public Ex01_Sub(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}