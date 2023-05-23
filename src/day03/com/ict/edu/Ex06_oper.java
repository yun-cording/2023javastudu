package day03.com.ict.edu;

public class Ex06_oper {
public static void main(String[] args) {
	// 대입연산 : = , += , -= , *= , /= , %=
	// a = b -> 변수 a에 데이터 b를 저장
	// a += b -> a 데이터와 b데이터를 합해서 a에 저장한다  a=a+b
	
	
	int su1 = 7 ;
	
	su1 +=4 ; //su1 = su1 + 4
	System.out.println("결과 : " + su1);
	
	su1 -=4 ; //su1 = su1 - 4
	System.out.println("결과 : " + su1);
	
	su1 *=4 ; //su1 = su1 * 4
	System.out.println("결과 : " + su1);
	
	su1 /=4 ; //su1 = su1 / 4
	System.out.println("결과 : " + su1);
	

}
}
