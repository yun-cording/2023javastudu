package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		System.out.println(Ex01_interface.SU1);
		System.out.println(Ex01_interface.SU2);
		System.out.println(Ex01_interface.su3);
		System.out.println(Ex01_interface.su4);
		
		
		// 1.추상화를 다 오버라이딩해서 일반클래스로 만든다.
		// 2.추상클래스로 만든다
		// 3.인터페이스로 만는다
		
		Ex01_interface.like();
		System.out.println();
		
		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.play();
		System.out.println();
		
		// 익명 내부 클래스
		Ex01_extends2 t2 =new Ex01_extends2() {
			
			@Override
			public void sound() {
				System.out.println("뮤직듣기");
			}
			
			@Override
			public void play() {
				System.out.println("오락실게임하기");
			}
		};
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		System.out.println();
		
		Ex01_extends4 t3 = new Ex01_extends4();
		System.out.println(t3.name);
		t3.tour();
		t3.sound();
		t3.play();
	}
}
