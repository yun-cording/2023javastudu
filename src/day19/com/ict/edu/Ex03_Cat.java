package day19.com.ict.edu;

public class Ex03_Cat implements Runnable {

	public void run() {
		while(true) {
		System.out.println("야오옹~~"+ Thread.currentThread().getName());
		}
	}
}
