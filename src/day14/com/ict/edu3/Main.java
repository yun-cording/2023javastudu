package day14.com.ict.edu3;

public class Main {
	public static void main(String[] args) {
		MP3_Phone mp3 = new MP3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();

		System.out.println("==================");

		DCa_phone dca = new DCa_phone();
		dca.call();
		dca.picture();
		dca.sms();

	}
}
