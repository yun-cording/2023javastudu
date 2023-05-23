package day19.com.ict.edu;

import java.util.Iterator;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_Cat cat =new Ex04_Cat();
		Ex04_dog dog = new Ex04_dog();
		Thread t_cat = new Thread(cat);
		// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드
		//				일반 스레드가 종료되면 데몬 스레드는 강제로 종료 됨
		t_cat.setDaemon(true);
		t_cat.start();		
		
		Thread t_dog = new Thread(dog);
		t_dog.start();
//		t_dog.setDaemon(false);
		System.out.println("메서드 이름 : " + Thread.currentThread().getName());
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("종료");
		
	}
}
