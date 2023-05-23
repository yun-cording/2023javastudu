package day18.com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {
	public static void main(String[] args) {
		/*
		 * List 인터페이스 : 배열과 흡사한 구조 삽입 , 삭제 , 추가가 자유롭다. 크기를 미리 지정하지 않다도 된다. List 인터페이스를
		 * 구현한 클래스 : Stack , ArrayList , Vector;
		 * 
		 * ArrayList : 멀티스레드 동기화 지원 안함 Vector : 멀티스레드 동기화 지원 함 // 웹 상에서 동시에 여러명이 한가지 일을
		 * 처리할때 백터사용 ArrayList 와 Vector 사용법은 같다.
		 */

		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민"); // 중복 가능
		list.add("손흥민");

		vector.add("우리흥");
		vector.add("우리흥");
		vector.add("이과인");
		vector.add("이적준비");
		vector.add("우리흥"); // 중복 가능

		list.add(1, "차범근"); // 삽입
		vector.add(1, "차범근"); // 삽입

		System.out.println(list);
		System.out.println();
		System.out.println(vector);

		// 검색 : serach() , elementAt() , firstElement() , lastElement() : list는 다 없음

		// indexOf() 로 검색해야함
		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));// 앞에서부터 손흥민이 처음 나온 위치값
			System.out.println(list.lastIndexOf("손흥민")); // 마지막으로 나오는 손흥민이 나오는 위치값
			// 치환
			list.set(list.lastIndexOf("손흥민"), "지올팍");

		}

		System.out.println(list);
		// elementAt() , firstElement() , lastElement() : vector에는 있음
		if (vector.contains("우리흥")) {
			System.out.println(vector.indexOf("우리흥"));// 앞에서부터 손흥민이 처음 나온 위치값
			System.out.println(vector.lastIndexOf("우리흥")); // 마지막으로 나오는 손흥민이 나오는 위치값
			// 치환
			vector.set(vector.lastIndexOf("우리흥"), "지올팍");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
			System.out.println(vector.elementAt(3));
		}
		System.out.println(vector);

		// 출력 : 개선된 for문 , iterator
		for (String str : vector) {
			System.out.println(str);
		}
		Iterator<String> str1 = vector.iterator();
		while (str1.hasNext()) {
			String k = str1.next();
			System.out.println(k);
		}
		System.out.println("==================");
		// 삭제 ; remove
		list.remove("손흥민");
		vector.remove("우리흥"); // 삭제할 내용이 2개이상일땐 1개만 삭제됨
		System.out.println(list);
		System.out.println(vector);

		// 출력 : 개선된 for문 , iterator
		System.out.println("==================");
		for (String k : vector) {
			System.out.println(k + " 골");
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k+" 치킨");
		}
	}
}
