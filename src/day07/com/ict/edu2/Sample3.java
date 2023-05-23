package day07.com.ict.edu2;

public class Sample3 {
public static void main(String[] args) {
	
			int sum = 0 ;
			int count = 0 ;
			int a = 1 ;
			int sign = 1 ;
			
			while (sum<100) { 
			sum = sum + (sign * a) ;
			if(sign == 1) sign = -1; 
			else sign = 1 ;
			a++;
			count++;
			}
			System.out.println(sum);
			System.out.println(count);

// (5 번) - * for문
// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
// 새로운방법 문제 풀이
//
//			int sum11 = 0;
//	        int asd = 1;
//	        int sign = 1;
//	        int count12 = 0;
//	        
//	        
//	        while(sum11<100) {
//	            sum11+= (sign*asd);
//	            sign*=-1;
//	            asd++;
//	            count12++;
//	        }
//			
//	        System.out.println(count12);
//	        System.out.println(sum11);
}
}
