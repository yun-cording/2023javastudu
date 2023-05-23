package day19.com.ict.edu;

public class Ex03_Dog implements Runnable {

	public void run() {
		while(true) {
			System.out.println("멍~~"+ Thread.currentThread().getName());
		}
	}
}
