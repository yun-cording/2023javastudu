package day14.com.ict.edu;

import java.util.Random;

public class Ex06_extends extends Random{
	int su = nextInt();

	public Ex06_extends() {
		System.out.println("Ex06 : " + su);
		
	}
	
	public static void main(String[] args) {
		Ex06_extends test = new Ex06_extends();
		// 이런식으로 상속받아서 생성자로 받아서 사용도 가능
		
		
	}
}
