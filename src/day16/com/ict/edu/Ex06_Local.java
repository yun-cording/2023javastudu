package day16.com.ict.edu;

public class Ex06_Local {
	String name = "둘리";
	public Ex06_Local() {
		System.out.println("외부 생성자 : " + this);
	}
	public void sound() {
		String str = "호이~호이~";
		System.out.println(str);
				
	}
	
	public void play() { // 외부클래스 멤버 메서드 시작
		int age = 24;
	
		class Inner02{	// 외부클래스 안 멤버메서드 안 내부 클래스 시작
			String addr = "서울 ";
			public Inner02() {
				System.out.println("내부생성자 : "+ this);
			}
			public void prn() {
				System.out.println(name);
				System.out.println(addr);
				System.out.println(age);
			
		}// 외부 클래스 멤버 메서드 안에 내부 메서드 끝
	}// 외부 클래스 멤버 메서드 안 내부클래스 끝
	Inner02 inner02 = new Inner02();
	inner02.prn();
	//외부클래스 멤버메서드 끝나기전에 내부클래스 객체생성하고 작동해야 사용가능
	}// 외부클래스 멤버 메서드 끝
}//외부 클래스
