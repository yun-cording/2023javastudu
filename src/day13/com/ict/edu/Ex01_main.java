package day13.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01_Construtor p1 = new Ex01_Construtor();
		
		System.out.println(p1);
		// p1이랑 생성자에 넣어둔 thi랑 같은 주소가 나옴
		// this.name 이나 p1.named이나 같은 걸 지칭핟나.
		// 즉 클래스 내부에서 변수들을 지칭하기 위해 사용하는게 this
		System.out.println(p1.getName());
		
	}
}