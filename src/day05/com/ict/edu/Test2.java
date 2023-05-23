package day05.com.ict.edu;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// =================================================
		// scanner을 이용하여 숫자르 받고 받은 숫자까지 더해서 누적합을 구하기
		//(1번) 1 + (-2) + 3 (-4) + 5 (-6) + 7 +(-8) + 9 ...
		// while문을 이용한 누적합
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int su = scan.nextInt();
		int count = 0 ;
		int sum = 0 ;
		while(count<=su) {
			if(count%2==0) {
				sum= sum + (count*-1) ;
			}
			else {
				sum += count ;
			}				
			count++;
		}
		
		System.out.println(sum);
		System.out.println("=======================================");
		// =================================================
		// (2 번) - * switch~ case문 사용
		// 입력값을 받아서 만들것
		// 농구공 5개씩 한 박스에 들어간다.
		// ex)40개면 8상자, 26개면 6개이다.
		System.out.print("농구공 개수는 : ");
		su = scan.nextInt();
		int box = 0 ;
		
		switch (su%5) {
		case 0:  box = su/5; break;
		default: box = su/5+1; break;
		}
	
		System.out.println("농구공은 총 : "+su +"개이고 박스는 : "+ box +"개 필요합니다.");
		System.out.println("=======================================");
		
		// =================================================
		// (4 번) - * 이중 while문으로 풀기
		//1 0 0 0
		//0 1 0 0
		//0 0 1 0
		//0 0 0 1
		char a = '1' ; 
		char b = '0' ;
		int k = 0 ;
		while(k < 4) {
			int n = 0 ;
			while(n<4) {
				if(n==k) {
					System.out.print(a+" ");
				}else {
					System.out.print(b+ " ");
				}
				
				n++;
			}
			System.out.println();
			k++;
		}
		
		
		
		// =================================================
		// (7 번) - * while문
		//       *
		//     * *
		//   * * *
		// * * * *
		
		char a1 = '★';
		char b1 = ' ';
		int k1 = 0 ;
		int n= 3 ;
		
		while(k1<4){
			n= 3 ;
			while(n>=0) {
				if(k1<n) {
					System.out.print(b1+" ");
				}else {
					System.out.print(a1+" ");
				}
				n--;
			}
		System.out.println();
		k1++;
		}
	}
}
