package day12.com.ict.edu;

public class Ex02_get_set {
	
	// 직접 접근을 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동";  //전역변수 name
	private int age = 24 ;
	private double weigh = 72.6;
	private boolean gender = true;
	
	// 불린혀은 getter 설정할때 is로 설정됨
	// ex) isGender
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	// 지역변수와 전역변수 이름이 같으면
	// 전역변수에 this를 붙인다.
	// 지역변수가 전역변수보다 우선 순위가 높다.
	// 
	public void setName(String name) {//지역변수 name
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeigh() {
		return weigh;
	}
	public void setWeigh(double weigh) {
		this.weigh = weigh;
	}
	
	// get() set() 메서드 이용
		
}