package day15.com.ict.edu2;

import java.util.Scanner;

import day15.com.ict.edu2.*;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("선택하세요 >> 1.고양이, 2.강아지");
		int su = scan.nextInt();
		
		// 다형성의 정적바인딩:
		/*
		switch (su) {
		case 1:
			Ex04_Cat c1at = new Ex04_Cat();
			cat.sound();
			cat.play();
			break;
		case 2:
			Ex04_Dog dog = new Ex04_Dog();
			dog.sound();
			dog.play();
			break;
		}
		*/
		
		// 다형성의 동적바인딩 동적 = 다이나믹 
		// 실시간으로 그때그때 변하는것
		// 객체 매개변수로 설정해서도 사용가능
		Ex04_abstract animal = null;
		switch (su) {
		case 1: animal = new Ex04_Cat(); 
			break;
		case 2: animal = new Ex04_Dog();
		break;		
		}
		animal.sound();
		animal.play();
//		System.out.println(animal.name);
		// 부모클래스를 선언했으므로 자식클래스만 가진 메서드는 사용 못함
		System.out.println(animal.getName());
		}
	}
}