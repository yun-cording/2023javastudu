package day07.com.ict.edu2;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02_String {
	public static void main(String[] args) {
		// String 클래스는 문자열을 처리하는 클래스
		// 기본자료형은 아니지만 기본자료형 처럼 사용
		// 메소드(인자) : 실행 결과의 자료형
		// String 에서 자주 사용되는 메소드들
		// 1. charAt(int index) : char
		// 인자 = 메소드가 실행하기 위해서 받은 재료(source)

		// 1. charAt(int index) : char
		// 위치정보 = index
		// 위치정보를 받아서 해당 위치의 존재하는 글자를 char형으로 반환

		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(15);
		System.out.println(str.charAt(16));
		System.out.println("결과 : " + k1);
		System.out.println(str);

		str = "대한민국 I Love You 123";
		// 모두 대문자로 만들자 ( 대문자는 그대로 , 소문자는 -32 대문자로 변경)
		// str.length() => str 문자열의 길이를 구해 준다.
		// 소문자를 대문자로 변경시켜주는 for&if문
		for (int i = 0; i < str.length(); i++) {
			char k2 = str.charAt(i);
			if (k2 >= 'a' && k2 <= 'z') {
				System.out.print((char) (k2 - 32));
			} else {
				System.out.print((char) k2);
			}
		}
		System.out.println();

		// 2. concat(String str) : String
		// 입력된 문자열을 현재 문자열과 합친다. ("문자열" + "문자열");
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);

		// 3. contains(CharSeqence s) : boolean
		// CharSequence : char 값을 읽을수 있는 시퀸스 , 인터페이스
		// CharSequence 지금은 String이라고 생각하자
		// 현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false

		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("REA"));
		System.out.println(s4.contains("rea"));
		System.out.println("=============================");

		// 4. equals(Object anObject) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true , 다르면 false (대소문자를 구별)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true , 다르면 false (대소문자를 구별하지않음)
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s6.equalsIgnoreCase(s5));

		// 6. format(String format , Object...args) : static String
		// 형식을 지정하고 형식에 맞춰 생성
		// 문자열 => %s
		String s7 = "ICT 인재 개발원";
		String s8 = String.format("%s", s7);
		System.out.println(s8);

		// %30s 30자리 차지하는 문자열 ( 남은 자리는 비워 둔다 . ) 오른쪽 정렬
		s8 = String.format("%30s", s7);
		System.out.println(s8);

		// %30s 30자리 차지하는 문자열 ( 남은 자리는 비워 둔다 . ) 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);

		// 자리가 모자르면 알아서 다 나옴
		s8 = String.format("%3s", s7);
		System.out.println(s8);

		// %.2s로 할당했을경우 자리가 모자라면 짤린다 .2 면 2번째자리까지만 나옴
		s8 = String.format("%.2s", s7);
		System.out.println(s8);
		System.out.println("==========================================");

		// %d 정수 형식 지정 정수형이 String형식으로 바뀜
		int s9 = 23141212;
		s8 = String.format("%d**", s9);
		System.out.println(s8);

		// 오른쪽정렬
		s8 = String.format("%6d", s9);
		System.out.println(s8);

		// 왼쪽정렬
		s8 = String.format("%-5d", s9);
		System.out.println(s8);

		// 오른쪽 정렬 (할당 공간중 빈 공간 0으로 채운다.)
		s8 = String.format("%06d", s9);
		System.out.println(s8);

		// (세자리 마다 콤마)
		s8 = String.format("%,d", s9);
		System.out.println(s8);
		System.out.println("==========================================");

		// %f => 실수형식
		// %.3f => 소수점 3째자리까지 구함 그 뒤는 반올림
		double s10 = 1245.44567954;
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%20f", s10));
		System.out.println(String.format("%.3f", s10));
		System.out.println(String.format("%.1f", s10));
		System.out.println(String.format("%-1f", s10));
		System.out.println("==========================================");

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할때 사용한다 . (대/소문자,숫자,일부특수문자 가능 , 영어를 제외한 글자 안됨)
		String a1 = "java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]); // j 숫자
		System.out.println(b1[1]); // a 숫자
		System.out.println(b1[2]); // v 숫자
		System.out.println(b1[3]); // a 숫자
		System.out.println(a1.getBytes());
		System.out.println("==========================================");
		// for문과 배열은 아주 시너지가 좋다 . 서로 뗼수 없는 기능
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]); // 보낸 문자를 숫자로 나타내는데
		}
		for (int i = 0; i < b1.length; i++) {
			System.out.println((char) b1[i]); // char형으로 형변환 넣어주면 문자로보여줌
		}
		System.out.println("==========================================");

		// 8. hashCode() : int
		// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String hashCode는 각 문자열에서 정수값으로 변경
		String a2 = "홍길동";
		System.out.println(a2.hashCode());

		String a3 = "홍길동";
		System.out.println(a3.hashCode());

		// 문자열일 때 ==는 값이 같다가 아니라 주소가 같냐?
		// 문자열일 때 equals는 내용이 같냐고 물어보는것
		System.out.println(a2 == a3);
		System.out.println(a2.equals(a3)); // String한테 같은걸 비교할땐
		// equals or equalsIgnoreCase 써서 비교해야함
		System.out.println("==========================================");
		// 9. indexOf(int ch), indexOf(String str) :
		// ()안에 char , string이 들어가는데 그 위치를 찾아준다
//	charAt() 위치를 주면 그걸 찾아냄 그 반대로 indexOf는 문자를 집어넣으면 그 위치 주소값을 나타냄
		// 입력된 char , String를 해당 문자열에 char나 String의 위치값을 알려준다.
		// 찾는 문자나 문자열이 없으면 -1반환
		String a4 = "BufferedReader";

		// 'R'을 찾아라
		System.out.println(a4.indexOf('R'));
		// 'r'을 찾아라
		System.out.println(a4.indexOf('r'));
		// 'K'를 찾아라
		System.out.println(a4.indexOf('k'));
		// "er"를 찾아라
		System.out.println(a4.indexOf("er"));
		System.out.println("==========================================");

		// 10 . lastIndexOf(int ch) , lastIndexOf(String str) : int
		// 입력된 char , String를 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
		// 'R'을 찾아라
		System.out.println(a4.lastIndexOf('R'));
		// 'r'을 찾아라
		System.out.println(a4.lastIndexOf('r'));
		// 'K'를 찾아라 찾는 문자나 문자열이 없으면 -1반환
		System.out.println(a4.lastIndexOf('k'));
		// "er"를 찾아라
		System.out.println(a4.lastIndexOf("er"));

		System.out.println("==========================================");

		a4 = "BufferedReader";
// 11. indexOf(int ch , int fromIndex), indexOf(String str , int fromIndex): int
		// 2번째 , 3번째 문자나 문자열 찾기 위함
		// fromIndex => 시작 위치값
		System.out.println(a4.indexOf('e', 0)); // a4.indexOf('e')와 같은내용

		// 첫번째 'e'의 위치가 4로 나왔다. 2번째 e를 찾으려면 4이후로 시작위치를 지정해줘야함
		System.out.println(a4.indexOf('e', 5)); // 6이 나옴

		System.out.println(a4.indexOf('e', a4.indexOf('e', 0) + 1));
		// 직접 시작위치를 찾아서 입력하지않고 처음 찾은다음부터 찾기위해 시작위치를 저렇게 지정함
		// 2번째 e의 위치를 찾는방법

		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0) + 1) + 1)); // 6이 나옴
		// 3번째 e의 위치를 찾는방법
		System.out.println("==========================================");

		// 12. length() : int => 문자열의 길이(갯수) => 1부터 시작
		// 문자열의 위치(index)=>0부터 시작
		System.out.println(a4.length());

		// 13. replace(char oldChar , char newChar) : String
		// replace(String oldString , char newString) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.

		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replaceAll("한", "한 a❤😎❤😎");
		String a8 = a5.replace(a5, "大韓民國");
		System.out.println(a5); // a5는 안바뀜
		System.out.println(a6); // a6은 바뀐게 나옴
		System.out.println(a7); // 한 단어를 여러단어로 바꿀수 있음
		System.out.println(a8); // 변수전체를 다른문장으로 바꿀수 있음

		System.out.println("==========================================");
		// 14. isEmpty() : boolean
		// 해당 문자열이 비어있으면 true , 내용이 있으면 false
		// db에서 안에 내용이 비었나 등 쓸수도 있다
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());

		t5 = "";
		System.out.println(t5.isEmpty());
		System.out.println("==========================================");
		// 15. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// regex => 구분자(나눔 기준) , limit => 배열의 크기 (방의 갯수)
		t5 = "사과, 딸기 , 오렌지 ,@ 망고 , 두리안 , 용과";
		String[] arr = t5.split(","); // 여기서기준은 ,
		// []배열 기준치를 주고 기준으로 위에 단어들을 각 방에 집어넣음.
		System.out.println(arr[2]); // []안에 번호를 넣으면 그번호 방에 있는개나옴
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		System.out.println(t5.split(t5));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} // limit값을 안지정해줘서 다 나옴
		System.out.println("==========================================");
		t5 = "사과1딸기1오렌지1망고1두리안1용과";
		String[] arr1 = t5.split("1"); // 여기서기준은 1 기준은 선정하기 나름
		System.out.println(arr1[2]);
		System.out.println("==========================================");
		t5 = "사과, 딸기 , 오렌지 ,@ 망고 , 두리안 , 용과";
		String[] arr2 = t5.split(",", 3); // limit을 3개로 지정
		// 방크기가 3개라 사과 1개 딸기 1개 나머지방에 나머지값들이 들어간다.
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("==========================================");
		// 16. substring(int beginIndex) : String
		// 입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);// 4번부터 끝까지 출력문
		System.out.println(t7);// 9732-9110까지 나옴
		t7 = t6.substring(9);
		System.out.println(t7);

		t7 = t6.substring(t6.lastIndexOf("-") + 1);
		System.out.println(t7);

		// 16-2 substring(int beginIndex , int endIndex) : String
		// beginIndex 위치부터 endIndex 위치까지 (endindex 위치는 포함하지않음)

		t6 = "010-9732-9110";
		t7 = t6.substring(4, 8);// 가운데 4자리 뽑아내는 방법
		System.out.println(t7);
		t7 = t6.substring(0, 1);// 첫째자리 뽑아내는 방법
		System.out.println(t7);// 첫째자리 뽑아내는 방법

		// 010-9732-9110 => 010-****-9110 or 010-9732-****
		String t8 = "010-9732-1234";
		String t9 = "****";
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);
		t10 = t8.replace(t8.substring(9, 13), t9);
		System.out.println(t10);
		// 치환의 단점 숫자가 같을경우 다 바뀜
		// ex) 010-1111-1111 => 010-****-****
		t10 = t8.replace(t8.substring(t8.indexOf("-") + 1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);

		t10 = t8.replace(t8.substring(t8.lastIndexOf("-")), t9);
		System.out.println(t10);

		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);

		System.out.println(arr3[0] + "-****-" + arr3[2]);// 이런식으로 응용가능
		System.out.println(arr3[0] + "-" + arr3[1] + "-****");
		t10 = t8.replace(arr3[1], t9); // 이렇게도 가능
		System.out.println(t10);

		// 17. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		// toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		String str1 = "javaLand03Exam"; 
		System.out.println(str1.toUpperCase()); //다 대문자로
		System.out.println(str1.toLowerCase()); //다 소문자로

		// 소문자 = > 대문자로 변경하기
		String str2 = "";
		for (int i = 0; i < str1.length(); i++) {
			char k = str1.charAt(i);
			if (k >= 'a' && k <= 'z') {
				str2 = str2 + (char) (k - 32); // 소문자에서 -32로 대문자만들기
			} else {
				// 나머지는 그대로 출력
				str2 = str2 + k;
			}
		}
		System.out.println(str2);
		
		System.out.println("===================================");
		// 18. toString : String
		// 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용 가능한 메소드
		//	클래스(객체)가 가지고 있는 정보나 값(데이터)들을 문자열로 만들어서 반환
		//  String 에서 toString : 문자열 자체 반환
		// toString 했을경우 주소값도 
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1.equals(u2));
		
		// 19. trim() : String
		//	해당 문자열의 앞, 뒤 공백 제거 , 글자사이의 공백은 제거 못함
		//  정보를 받을때 앞뒤에 쓸데없는 공백을 지울때 사용
		String u3 = "   java  자바  JAVA  12    ";
		System.out.println(u3);
		System.out.println("길이 : " + u3.length());
		
		System.out.println(u3.trim());
		String u4 = u3.trim();
		System.out.println("길이 : " + u4.length());
		
		// 20. startsWith(String prefix) : boolean
		//		주어진 문자열로 시작하는지 검색

		//     startsWith(String prefix, int toffset) : boolean
		//		주어진 문자로 시작하는지 검색 , toffset => 시작위치
		
		//		endWith(String suffix) : boolean
		//		주어진 문자로 끝났는지 검사
		System.out.println("===================================");
		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA")); // false
		System.out.println(u5.startsWith("java")); // true
		System.out.println(u5.startsWith("자바"));  // false
		System.out.println();
		
		System.out.println(u5.endsWith("JAVA")); // true
		System.out.println(u5.endsWith("java")); // false
		System.out.println(u5.endsWith("자바"));  // false
		
		// 21. valueOf(기본형) : 들어온 기본 자료형을 String으로 변경 시킨다.
		// 클래스가 자료형이면 참조 자료형
		// 기본자료형 정수 , 실수 , 논리 , 문자
		System.out.println("===================================");
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34 ; 
		long num2 = 37L;
		double num3 = 345.127;
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("===================================");
		
		//System.out.println(bo1+1);
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println("===================================");
		
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println("===================================");
		
		System.out.println(bo1+""+1);
		System.out.println(ch1+""+1);
		System.out.println(num1+""+1);
		System.out.println(num2+""+1);
		System.out.println(num3+""+1);
		
		System.out.println("===================================");
		
// 22. Wrapper Class
// 기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
// 22-1. "true" "false" => true , false : boolean.parseBoolean()
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg); //"true"
		System.out.println(msg2); // true
		if(msg2) { //msg는 오류나고 msg2는 boolean형으로 바뀌어서 오류안남
			System.out.println("변경1");
		}else {
			System.out.println("변경2");
		}
		System.out.println("===================================");
		//22-2. "142", "25" =>  142 , 25 =>Integer.parseInt()
		msg = "142";
		int msg3 = Integer.parseInt(msg); // 142
		System.out.println(msg + 10); //14210
		System.out.println(msg3 + 10); //152
		System.out.println("===================================");
		// 22-3. "1233211" , "3243521" => 1233211 ,3243521 =>
		//Long.parseLong(); "숫자"=>Ok , "숫자L" => err
		msg = "123123121231";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg+9); // 1231231212319가됨
		System.out.println(msg4+9); //123123121240 계산이 됨
		
		// 22-4. "347.457" => 347.457 => Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg5+0.04); //347.497 계산이됨
		System.out.println(msg+0.04);  //347.4570.04 추가만됨
		
		msg = "347.457f";
		msg5 = Double.parseDouble(msg);
		System.out.println(msg5+0.04); //347.4570.04 계산이됨
		System.out.println(msg+0.04);  //347.457f0.04 추가만됨
		
		// 22-5 Character.parseCharacter()는 존재하지 않는다.
		//		String의 charAt() 이용하면 char를 가져올수 있다.
		msg = "p";
		char msg6 = msg.charAt(0);
		System.out.println("===================================");
		//////////////////////////////////////
		msg = "java 자바 JAVA 大韓民國 2023 %*";
//String.getBytes() => byte[] (영문자  대/소문자, 숫자 및 일부 특수문자만 가능)
		// getbytes[] 배열안에 각 글자하나씩 숫자로 집어넣음 ex)j에 해당하는 숫자
		
		byte[] result = msg.getBytes();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +":"+ (char)(result[i]));
		}
			// String.toCharArray() => char[] 모든문자 처리 가능
			char[] result2 = msg.toCharArray();
			for (int i = 0; i < result2.length; i++) {
				System.out.println(result2[i]);
			}
		
		}
}