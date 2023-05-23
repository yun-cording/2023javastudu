package day11.com.ict.edu;

import java.util.Scanner;

public class test02_method {
	Scanner scan = new Scanner(System.in);

	int sum = 0 ;
	int rank = 1;
	double avg = 0;
	String hak = "";
	
	public String getName() {
		System.out.print("이름 : ");
		String name = scan.next();
		return name;
	}
	public double getSum() {
		System.out.print("국어 : ");
		double kor = scan.nextDouble();
		System.out.print("영어 : ");
		double eng = scan.nextDouble();
		System.out.print("수학 : ");
		double math = scan.nextDouble();
		return kor + eng + math;
	}
	public double getAvg() {
		return avg = (int) (sum / 3.0 * 10) / 10.0;
	}
	public String getHak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		return hak;
	}	
}
