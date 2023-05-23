package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// scananner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 출력장치(모니터)
		// System.in => 표준 입력장치(키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import 를 해야 된다.
		// 패키지란 : 비슷한 기능을 하는것들을 묶어둔것
		// ctrl + shift + o = 필요한 클래스 기능을 자동 임포트 해준다.
		// java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용가능(import 필요없음)
		// java.lang 패키지 외에 존재하는 클래스는 무조건 import해야된다.

		// import 방법) 1. 클래스 이름 뒤에서 ctri+space 추천
		// 2.ctrl + shift + o

		// 해당 클래스 뒤에 커서를 놓고 shift + f2 누르면 해당 클래스 API 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		// .next() 입력한 내용을 String 으로 처리하는 메소드
		String name = scan.next();
		System.out.println("받은 내용 : " + name);

		System.out.print("나이 : ");

		String age = scan.next(); // 받은내용을 String으로 처리
		System.out.println("받은 내용 : " + (age + 1)); //28 입력시 281

		System.out.print("나이 : ");

		int age2 = scan.nextInt(); //nextint은 받은내용을 int로 처리하는 메소드
		System.out.println("받은 내용 : " + (age2 + 1)); //28입력시 29
		// nextInt() 문자를 입력하면 오류가 남 int형으로마 입력가능
		
		System.out.println("키 : ");
		//.nextDouble() : 입력한 내용을 double 으로 처리하는 메소드(문자입력시 오류)
		double ke = scan.nextDouble();
		System.out.println("키 :"+ ke);
		
		System.out.print("당신은 남성입니까?(true/false)");
		// .nextBoolean(): 입력한 내용을 boolean으로 처리하는 메소드
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : " + gender);
		
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}
		else {
			System.out.println("당신은 여성입니다.");
		}
		// nextChar()은 존재하지 않는다. 그러므로 char는 사용 못함
		
	}
}
