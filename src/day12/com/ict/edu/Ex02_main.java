package day12.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_get_set t1 = new Ex02_get_set();
		
		// 이름 가져오기
			//String str = t1.name ;
			String str = t1.getName();
			System.out.println(str);
		
		// 이름 변경하기
		 
			//t1.name ="일지매";
			//tring res = t1.name;
		t1.setName("일지매");
		String res =t1.getName();
		 System.out.println(res);
		}
}
