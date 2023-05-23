package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String s1 = "ictedu";
		String s2 = "ictedu";
		
		String s3 = new String("ictedu");
		String s4 = new String("ictedu");
		char[] ch = {'i' , 'c' , 't' , 'e' , 'd' , 'u'};
		String s5 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("===========================");
		
		if(s1 == s2) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1 == s3) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1 == s4) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1 == s5) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
				
		System.out.println("===========================");
		// equals() : 내용이 같냐?
		if(s1.equals(s2)) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1.equals(s3)) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1.equals(s4)) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		if(s1.equals(s5)) {
			System.out.println("같다");
			
		} else {
			System.out.println("같지 않다.");	
		}
		
		System.out.println("===========================");
		
		// String 문자열은 수정 불가능(불변적 특징)
		s1 = s1 + "대한민국";  // 이렇게 s1에 대한민국을 더하려면 수정이 불가능하니
		System.out.println(s1);	// 새로운 주소로 s1+대한민국 이 더해진 문자열 이만들어짐
		System.out.println(s2);			
		
		if(s1==s2) { // 그로인해 주소가 같던 s1,s2는 더해지며 주소가 새로워진 s1이랑 주소가 달라진다.
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
