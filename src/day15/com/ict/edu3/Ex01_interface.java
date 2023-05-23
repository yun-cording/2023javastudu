package day15.com.ict.edu3;

// 인터페이스 : 서비스를 제공하는 목록
// 			상수 , 추상메서드만 가지고 있다.
//			일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//			객체 생성 안됨	( 생성자도 없다. )
//			다중상속을 할 수 있다.(인터페이스는 여러개의 인터페이스를 부모로 만들 수 있다.)
//			클래스를 부모로 만들 수 없다.
//			'인터페이스가 같다'라는 말은 '대체가 가능하다.' '호환이 가능하다' 라는 뜻
//	인터페이스 상속 : 인터페이스 extends 인터페이스 , 클래스 extends 클래스 , 클래스 implement 인터페이스 
//	
public interface Ex01_interface {
		

		final int SU1 = 10;
		static final int SU2 = 20;
		// 이렇게 사용해도 인터페이스 안에서는 모두다 static final 이다
		int su3 = 30;
		static int su4 = 40;
		
		// 추상 메서드
		public abstract void sound();
		// 인터페이스 안에서는 abstract 생략 가능
		public void play();
		
		// 일반 메서드는 사용 불가
//		public void hobby() {};
		
		// static 메서드 사용은 가능하지만 잘 안씀
		public static void like() {
			System.out.println("놀기 좋아");
		};
		
}