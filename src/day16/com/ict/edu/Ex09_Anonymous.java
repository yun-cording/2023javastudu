package day16.com.ict.edu;

interface Animal{
	public void sound();

	String play();
}

interface Animal2{
	public String play();
}

class dog implements Animal , Animal2{
	@Override
	public void sound() {
	System.out.println("멍 ~ 멍 ~");
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "꼬리잡기";
	}
}

class cat{
	void music(Animal animal) {
		animal.sound();
	}
	void game(Animal2 animal2) {
		System.out.println(animal2.play());
	}
}

public class Ex09_Anonymous {
	public static void main(String[] args) {
		dog dog = new dog();
		dog.sound();
		System.out.println(dog.play());
		
		cat cat = new cat();
		cat.music(new Animal() {
			@Override
			public void sound() {
				System.out.println("야오옹~야~오옹");
			}

			@Override
			public String play() {
				// TODO Auto-generated method stub
				return "그루밍하기" ;
			}
		});
		cat.game(new Animal2() {
			@Override
			public String play() {
				// TODO Auto-generated method stub
				return "그루밍";
			}
		});
		
	}
}
