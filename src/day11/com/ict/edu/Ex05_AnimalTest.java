package day11.com.ict.edu;

import java.util.Scanner;

public class Ex05_AnimalTest {
	public static void main(String[] args) {		
		// 객체 생성
		Ex05_Animal a = new Ex05_Animal();
		// 이름 큰뿔소
		a.setName("큰뿔소");
		String name = a.getName();
		
		// 나이 3
		a.setAge(3);
		int age = a.getAge();
		
		// 생존여부 살아있음
		a.setLive(true);
		boolean live = a.getLive();
		
		// 결과 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("살았니 : " + live);
		
		
		// 이름을 팽귄, 나이 1살, 생존여부 살아있음 으로 변경
		a.setName("팽귄");
		a.setAge(1);
		a.setLive(true);
		System.out.println("=========================");
		age = a.getAge();
		name = a.getName();
		live = a.getLive();
		// 결과 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println(" 생사여부 : " + live);
		
		System.out.println("=========================");
		
		a.play(false, "진돌이", 14);
		
		a.prn(live, name, age);
		
		System.out.println("=========================");
		
		a.play("까치", 14 , true);
		a.prn(live, name, age);
		
		
	}
}
