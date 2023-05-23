package day16.com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		// 내부 클래스를 별도로 객체 생성할 수 없다. (static은 제외)
		//Inner01 test = new Inner01();
		
		// 외부클래스를 통해서 내부 클래스 객체를 생성한다.(Member내부클래스)
		Ex05_memberInnerClass test = new Ex05_memberInnerClass();
		
		Ex05_memberInnerClass.Inner01 exam = test.new Inner01();
		
		exam.prn();
		System.out.println();
		test.play();
		
	}
}
