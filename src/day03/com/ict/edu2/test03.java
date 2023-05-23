package day03.com.ict.edu2;

public class test03 {

	public static void main(String[] args) {
		// 3989초는 몇시간 , 몇분 , 몇초인가?
		
		int time = 3989;
		int h = 0 ;		//시간
		int m = 0 ;		//분
		int s = 0 ;		//초
		int na = 0 ;	//나머지
		
		h = time / (60*60) ;
		na = time % (60*60) ;
		m = na / 60 ;
		s = na % 60 ;
		System.out.println(h + "시간 " + m + "분" + s + "초");
		
		//===================================================
		int te = 3423 ;
		int cho = 1 ;
		int res1 , res2 , res3 ;
		int bun = cho*60 ;
		int si = cho*bun*60 ;
		
		res1 = te / si ;
		res2 = (te-(res1*si)) / bun ;
		res3 = (te-(res1*si))- bun*res2 ;
		
		System.out.println(te + "초는:"+ res1 + "시간 "+ res2 + "분 "+ res3 + "초입니다");
	}

}
