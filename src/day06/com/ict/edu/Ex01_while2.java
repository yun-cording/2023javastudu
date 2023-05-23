package day06.com.ict.edu;

public class Ex01_while2 {
public static void main(String[] args) {
	//구구단 -1  만들기
	int i = 2;
	while (i<10) {
		int j = 1;
		while(j<10) {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
		}
		System.out.println();
		i++;
	}
	System.out.println("=========================");
	
	//구구단 -2 만들기
	int i2 = 2;
	while (i2<10) {
		int j = 1;
		while(j<10) {
			System.out.print(i2+"*"+j+"="+i2*j+"\t");
			j++;
		}
		System.out.println();
		i2++;
	}
	System.out.println("=========================");
	
	// 구구단 -3 만들기
	int i3 = 1;
	while (i3<10) {
		int j = 2;
		while(j<10) {
			System.out.print(j+"*"+i3+"="+i3*j+"\t");
			j++;
		}
		System.out.println();
		i3++;
	}
	System.out.println("=========================");
}
}