package day07.com.ict.edu;

import java.util.Iterator;

public class Test01 {
public static void main(String[] args) {
	// =================================================
	// (1번) 1 + (-2) + 3 (-4) + 5 (-6) + 7 +(-8) + 9 + (-10)
	// for문을 이용한 누적합
	
	int sum = 0 ;
	for(int i =0 ; i < 11 ; i++) {
		if(i%2==0) {
			sum = sum+(i*-1);
		}else {
			sum = sum+i;
		}
	}
	System.out.println(sum);
	System.out.println("============================");
	// =================================================
	// (2 번) - * if~ else문 사용
	// 농구공 5개씩 한 박스에 들어간다.
	// 40개면 8상자, 26개면 6개이다.
	
	int k1 = 127;
	int res = k1 / 5; 
	if(k1%5 !=0) {
		res = res + 1 ;
	}
	System.out.println(res);
	System.out.println("============================");
	// =================================================
	// (3 번) - * for문으로 풀기
	for (int i = 1 ; i <= 16 ; i++) {
		System.out.print("0 ");
		if(i%4==0) {
			System.out.println();
			
		}
	}
	System.out.println("============================");
	
	// =================================================
	// 		(4 번) - * 이중 for문으로 풀기
	//		1 0 0 0
	//		0 1 0 0
	//		0 0 1 0
	//		0 0 0 1
	for(int i = 0 ; i<4;i++) {
		for(int j = 0 ; j<4;j++) {
			if(i==j) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");	
			}
		}
		System.out.println();
	}
	System.out.println("============================");
		
	// =================================================
	// (5 번) - * for문
	// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
	// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
	// for문은 횟수가 정해진 상황에서 쓰기 좋음
	// 이 문제같은 경우 while문을 이용해서 푸는게 좋음.
	// 방법 1 for문 사용
//	int sum2 = 0 ;
//	int count = 0 ;
//	for(int i = 1 ; i<200;i++) {
//		if(i%2==0) {
//			sum2 = sum2 + (i*-1);
//		}else {
//			sum2 += i; 
//		}
//		count = i ; // i 값이 for문 안에 생성된거라 count에 i값을 넣어서 밖으로 빼준다.
//		if(sum2 >= 100) {
//			break;
//		}
//	}
//	System.out.println(count);
	// 방법 2 while문 사용
	int sum2 = 0 ;
	int count = 0 ;
	int i = 1;
	while(true) {
		if(i%2==0) {
			sum2 = sum2 + (i*-1);
		}else {
			sum2 += i; 
		}
		count = i ; // i 값이 for문 안에 생성된거라 count에 i값을 넣어서 밖으로 빼준다.
		if(sum2 >= 100) {
			break;
		}
		i++;
	}
	System.out.println(count);
	
	
}
}
