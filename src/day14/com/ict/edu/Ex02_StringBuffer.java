package day14.com.ict.edu;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		// 문자열을 추가할대 사용 (메모지 주소가 변경되지 않는다.)
		// 추가할 때 append() 사용
		// toString() => String 전환한다.
		
		StringBuffer sb = new StringBuffer("ictedu");
		// 추가
		sb.append("대한민국");
		
		
		System.out.println(sb);
		System.out.println(sb.toString()); // 문자열 추가 완료하고 출력할땐 toString()으로 사용할 것
		
		// StringTokenizer : 구분자를 이용해서 문자열 분리 , split 과 차이점은 배열의 크기를 지정 못함
		//					구분자가 없으면 ( 띄어쓰기 , 탭 , 줄바꾸기 ) 로 구분
		// nextToken()를 이용해서 문자열 분리
		
		// split(String regex) : String[] 	split은 구분자가 없으면 오류
		// split(String regex), int limit) " String[]
		// retex => 구분자(나눔 기준) , limit => 배열의 크기(방의갯수)
		
		//hasMoreTokens 와 같은 기능의 hasMoreElements라는 기능이 있는데
		// 둘다 기능적으로는 똑같고 단 hasMoreElements은 배열에서도 사용할수 있다.
		// 기능은 이 메서드는 토큰이 존재하면 true를 반환하고 토큰이 더이상 없으면 false를 반환한
		String str = "4과 바나나 망고링고 5렌지 수박";
		StringTokenizer st = new StringTokenizer(str); 
		while(st.hasMoreTokens()) {
			String res = st.nextToken();
			System.out.println(res);
		}
		System.out.println();
		
		
		// 구분자 있음 , 
		// split 과 다른점은 크기 지정 못함
		str = "4과,바나나,망고링고,5렌지,수박";
		StringTokenizer st2 = new StringTokenizer(str,","); 
		while(st2.hasMoreTokens()) {
			String res = st2.nextToken();
			System.out.println(res);
		}		
		System.out.println();

		
		String [] arr = str.split(","); // split이 좀더 유용함
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
