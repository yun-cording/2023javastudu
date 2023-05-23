package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("메서드 이름 : " + Thread.currentThread().getName());
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cat cat = new Ex03_Cat();

		// Runnable를 start 메서드를 가지고 있지 않으므로 오류 발생
		// cat.start();

		// 이렇게 해서 start 실행가능
		Thread thread = new Thread(dog);
		thread.start();

//		Thread thread2 = new Thread(cat);
//		thread2.start();

		// 익명
		new Thread(cat).start(); // 이렇게도 호출 가능하지만 익명이라
		// 일회성으로 실행되고 끝

		// 익명 : new 클래스(인터페이스 i) ;
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("arr" + Thread.currentThread().getName());
				}
			}
		}).start();
		System.out.println("메서드 이름 : " + Thread.currentThread().getName());
	}
}
