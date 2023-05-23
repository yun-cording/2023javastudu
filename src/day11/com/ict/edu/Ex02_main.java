package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_method t1 = new Ex02_method();// 객체생성
		
		System.out.println("총점 : "+  t1.sum);
		System.out.println("평균 : "+  t1.avg);
		System.out.println("학점 : "+  t1.hak);
		//void 함수 호출하기전이라 실행이 안되서 초기값들만 나옴
		System.out.println("====메서드 실행====");
		
		t1.getSum();
		t1.getAvg();
		t1.getHak();
		
		System.out.println("총점 : "+  t1.sum);
		System.out.println("평균 : "+  t1.avg);
		System.out.println("학점 : "+  t1.hak);
		
		
	}
}
