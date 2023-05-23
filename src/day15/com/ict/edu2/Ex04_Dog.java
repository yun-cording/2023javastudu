package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract {
	String name = "도하";
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}
	@Override
	public String getName() {
		return name;
	}

	
	
}
