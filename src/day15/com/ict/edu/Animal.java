package day15.com.ict.edu;

public  class Animal {
	// final 변수 = 상수 = 데이터 변경 방지
	// final 메서드 = 오버라이딩 방지 = 메서드 내용 변경 방지
	// final 클래스 = 상속방지 (자식 클래스 생성 방지)
	int eye = 2;
	String color = "그레이";
	
	public void sound() {
	System.out.println("을음소리");	
	}
	
	public void hobby() {
		System.out.println("좋아하는행동");
	}
	
	// 부모클래스의 해당 메서드 final 붙이면 수정 불가능해짐 오버라이딩 불가
//	public final void sleep() {
//		System.out.println("8시간 이상 잠을 잔다.");
//	}
	
}
