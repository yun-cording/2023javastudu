package day18.com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 => toArray();
		// 배열을 컬렉션으로 => Arrays.asList();
		
		String[] str = {"java" , "Jiva" , "JAVA" , "자바"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println("==========");
		
		// set1의 모든 요소를 set2에 넣어주세요(addAll());
		set2.addAll(set1);
		System.out.println(set2);
		System.out.println("==========");
		// 삭제 ; clear(), remove(Object o)
		// 비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));
		System.out.println(set2.add("지바")); // add는 추가 추가 됐으니 true 뜸
		System.out.println(set2);
		
		// 중복불가
		System.out.println("==========");
		System.out.println(set2.add("JAVA"));// (add는 추가) 추가 됐으니 true 뜸
		System.out.println(set2);
		System.out.println(set2.add("JAVA")); // 이미 들어가있어서 중복이 불가능해서 false 뜸
		System.out.println(set2);
		
		
		
	}
}
