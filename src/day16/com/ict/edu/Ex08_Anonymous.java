package day16.com.ict.edu;

// 추상클래스 : 추상메서드를 하나이상 가지고 있는 클래스

abstract class Abc{
	int data = 1000;
	public abstract void printDate();
}

class AbcTest extends Abc{
	@Override
	public void printDate() {
		System.out.println("data1 : " + data);		
	}
}

class AbcTest2{
	//	상속받지 않고 바로 객체 생성
	Abc abc = new Abc() {
		
		@Override
		public void printDate() {
			System.out.println("data2 : " + data);
			
		}
	};
}

class AbcTest3{
	// 메서드나 메서드 인자에 사용 된다.
	public void prn() {
		new Abc() {
			
			@Override
			public void printDate() {
				System.out.println("data3 : " + data);
				
			}
		}.printDate();;
	}	
}

public class Ex08_Anonymous {
	public static void main(String[] args) {
		
		AbcTest t1 = new AbcTest();
		t1.printDate();
		
		AbcTest2 t2 = new AbcTest2();
		System.out.println(t2.abc);
		t2.abc.printDate();
		
		AbcTest3 t3 = new AbcTest3();
		t3.prn();
	}
	
	
}