package day18.com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06_List {
	/*	List 인터페이스 : 배열과 흡사한 구조
						삽입 , 삭제 , 추가가 자유롭다.
						크기를 미리 지정하지 않다도 된다.
		List 인터페이스를 구현한 클래스 : Stack , ArrayList , Vector;
		Stack : LIFO(Last In First Out)
				마지막에 들어온 데이터가 먼저 나가는 형태
				
		add, push , addElement => 추가 
		add(index, E) => 삽입
		pop : 맨 위에 존재하는 객체를 반환하고 삭제 한다.
		peak : 맨 위에 존재하는 객체를 반환. 삭제 안함.
		serch : 검색 (오른쪽, 1부터)  => 스택 관점  	서치와 인덱스오브는 방향과 시작 숫자가 다르다
		indexOf : 검색 (왼쪽, 0부터) => 배열 관점
		elementAt(index) : 요소 반환
		**get(index) 	 : 요소 반환
		firstElement()	 : 맨 처음 요소 반환
		lastElement()	 : 맨 마지막 요소 반환
		setElement(Element, index) : 치환
	*/
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이콜");
		
		stack.add(0, "고길동"); // 0번째 자리에 고길동 이름을 넣겠다는 뜻
		stack.add(2, "희동이"); 
		
		System.out.println(stack);
		// 마지막 객체 보기 : pop(삭제) , peek(삭제 안함)
		System.out.println(stack.peek()); // 마지막값이 반환 삭제 x
		//System.out.println(stack.pop()); // 마지막 값이 반환되고 삭제함
		
		System.out.println(stack);
		System.out.println();
		
		if(stack.contains("둘리")) {//둘리를 가지고 있는지 물어보는것
			// 둘리 위치 찾기
			System.out.println(stack.indexOf("둘리")); // 왼쪽시작 , 0부터시작 배열 느낌
			System.out.println(stack.search("둘리")); // 오른쪽 시작 , 1부터 시작
			
			// 위치 값을 이용해서 객체 얻기
//			System.out.println(stack.get(1)); // 해당 자리 요소 반환
//			System.out.println(stack.elementAt(1));
			System.out.println(stack.get(stack.indexOf("둘리"))); // 이런식으로 사용 둘리가 있는 위치를 찾고 그 위치 값을 반환해서 사용

		}else {
			System.out.println("존재하지 않음");
		}
			
		if(stack.contains("고길동")) {
			// 변경
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
		
		System.out.println(stack);
		System.out.println();

		//중복 가능
		stack.add("둘리");
		stack.add("고길동");
		System.out.println(stack);
		
		// 하나씩 꺼내기 (배열 , 왼쪽 , 0부터)
		for (String k : stack) {
			System.out.println(k+"님");
		}
		System.out.println();
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k+"짱");
		}
		// isEmpty가 비웠는지 물어보는거니까 안비웠으면 false가나옴 그래서 !표를 붙여서 반대로 있으면으로 조건을 바꿔줌
		// 스택방식으로 (오른쪽)
		while(! stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k+"크기는 " + stack.size()+ "이다.");
			
		}	
		System.out.println(stack);
		
		
		
		
	}
}
