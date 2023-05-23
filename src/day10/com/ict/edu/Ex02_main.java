package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// static ; 객체 생성 없이 , 클래스 이름.변수이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);

		// instance는 객체 생성 후 접근
		// 객체 생성)
		// 클래스 이름 참조변수 = new 생성자([인자]);
		// **해당 클래스의 생성자가 없으면 기본 생성자 사용
		// **기본 생성자란 인자가 없는 생성자 , 클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class(); // 생성자가없는경우 이렇게 만든다
		System.out.println(test); // test안에는 Ex02_class 주소값이 들어가있음
		// 접근법 ; 참조변스.멤버필드
		// 클래스 에서 불러올때 static(공용필드)에서 불러오는 값이 많으면
		// 속도도 느려지고 효율이 떨어짐
		// 대신 static에 저장되어 있는 값들은 어디서든 호출 가능하다
		System.out.println(test.GENDER);
		System.out.println(test.name);
		System.out.println(test.sum);// 이렇게도 static 접근 가능하지만
		System.out.println(test.AVG);
		System.out.println(Ex02_class.AVG); // static은 되도록 이렇게 접근 지향
		System.out.println(Ex02_class.sum);

		// 변수와 상수의 차이
		test.name = "일지매";
		// 상수라서 변경 못함
		//test.GENDER ="여성";
		Ex02_class.sum = 1000;
		// 상수라서 변경 못함
		//Ex02_class.AVG = 12345;
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
	}
}