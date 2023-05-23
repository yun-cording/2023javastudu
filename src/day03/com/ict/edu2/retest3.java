package day03.com.ict.edu2;

public class retest3 {

	public static void main(String[] args) {
		// 3989초는 몇시간 , 몇분 , 몇초인가?
		
		int si = 13457 ;
		int s = 1 ;
		int m = s * 60 ;
		int h = m * 60 ;
		int h1 = si / h ;
		int ros = si % h ;
		int m1 = ros / m ;
		int s1 = ros % m ;
		
		System.out.println(si + "초는" + h1 + "시간" + m1 + "분" + s1 + "초");
		

	}

}
