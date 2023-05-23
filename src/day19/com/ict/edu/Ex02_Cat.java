package day19.com.ict.edu;

public class Ex02_Cat extends Thread{
//	public void start() {
//		for(;;) {
//			System.out.println("야옹~야오옹~~~" + Thread.currentThread().getName());
//			}
//	}
	@Override
	public void run() {
		for( ; ;) {
		System.out.println("야옹~야오옹~~~" + Thread.currentThread().getName());
		}
	}
}
