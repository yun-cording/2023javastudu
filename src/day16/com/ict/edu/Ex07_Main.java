package day16.com.ict.edu;

import day16.com.ict.edu.*;
import day16.com.ict.edu.Ex07_static.Inner01;

public class Ex07_Main {
	public static void main(String[] args) {
		// static 사용법과 같음
//		Ex07_static test = new Ex07_static();
		System.out.println(Inner01.count);
		
		Inner01 test = new Inner01();
		System.out.println(test.addr);
		System.out.println(test.roomNumber);
		test.prn();
		
		System.out.println(test.addr);
	}
}
