package day03.com.ict.edu2;

public class test02 {

	public static void main(String[] args) {
		// 2 시간 40분 30초 는 몇초 일까요?
		
		int h = 2 * 60 * 60;
		int m = 40 * 60;
		int s = 30;
		int res2 = h + m + s ;
		System.out.println("2시간40분30초는 : " + res2 + "초입니다.");
		
		//===================================================
		
		int cho = 1;
		int bun = 60 * cho;
		int si = 60 * bun;
		int res = (si*2) + (bun*40) + (cho*30);
		//System.out.println(si);
		//System.out.println(bun);
		//System.out.println(cho);
		
		System.out.println("2시간40분30초는 : " + res + "초입니다.");
	}

}
