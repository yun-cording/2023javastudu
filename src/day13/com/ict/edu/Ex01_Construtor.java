package day13.com.ict.edu;

public class Ex01_Construtor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	// 지역변수와 전역변수 이름이 같을 때 전역변수 앞에 this를 붙인다
	// this는 자기자신의 주소
	// 클래스 내에서 this쓰면 자기자신을 뜻하는데
	// 객체생성한 p1. 으로 사용하는거나 this.로 사용하는거나 같다
	// this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	// 
	private String name = "홍길동";
	private int age = 34;
	
	public Ex01_Construtor() {
		// 생성자에서 생성자 호출
		// 생성자가 생성자를 호출할 수 있는데 그럴려면 첫째줄에 있어야함.
		this("윤성훈");// 밑에 생성자는 인자값으로 스트링을 받기때문에
		// 괄호 안에 스트링 값을 넣어줌
		System.out.println("기본생성자: "+this);
		// 생성자에서 메서드를 호출
		prn();
		this.prn();
	}
	
	// 생성자 오버로딩(같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Construtor(String name) {
		this.name = name;
		// 객체의 값을 변경하는건 2가지 방법이있음
		// 생성자를 이용해서 객체의 값을 변경하는 것(단 초기1번)
		// 언제든지 객체의 값을 변경할 수 있는건 셋터 메소드
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		
	}
	
}	
