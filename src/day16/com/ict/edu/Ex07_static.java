package day16.com.ict.edu;

// static 내부 클래스
public class Ex07_static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	public Ex07_static() {
		System.out.println("외부 : 생성자 " + this);
	}
	
	public void play() {
		int money = 1000 ;
		System.out.println("외부 메서드 : " + name);
		System.out.println("외부 메서드 : " + money);
		
	}	
	
	// 내부 클래스 멤버 변수가 static 이면 class를 static 으로 만들어야 한다.
	// 권장 사항은 아님 (일반 클래스 에서는 static 사용 못함)
	public static class Inner01{
		String addr = "서울시티";
		int roomNumber = 1;
		static int count = 30 ;
		
		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}
		
		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);
			
			// 외부클래스의 멤버 사용 못함 static 클래스로 변경해서
//			System.out.println(name);
//			System.out.println(age);
			System.out.println(gender);
			
			// 외부클래스의 메서드
//			play();
		}
	}
}
