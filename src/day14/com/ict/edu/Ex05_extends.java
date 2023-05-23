package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random {
	int su = nextInt(11);
	// Random 클래스를 상속 받아서 객체 생성하지 않아도 사용 가능하게 만듬	
	public void play() {
		System.out.println("Ex05 : " + su);
		
	}
	
	// static 메서드는 static 변수만 사용 가능
	// main 메소드도 스태딕 설정 되있어서 위에 변수를 사용못함
	public static void main(String[] args) {
		
		// 자기자신을 객체로 만들면 사용 가능
		Ex05_extends test = new Ex05_extends();
		test.play();
		
		
	}
}
