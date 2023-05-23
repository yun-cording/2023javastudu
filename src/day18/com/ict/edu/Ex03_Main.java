package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		// setter를 이용해서 데이터 넣기
		// 생성자를 이용해서 데이터 넣기
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(24);
		p1.setWeight(34.2);
		
		// 생성자를 이용해서 데이터 넣기
		Ex03 p2 = new Ex03("희동이",3,13.2);
		Ex03 p3 = new Ex03("마이클",21,66.2);
		Ex03 p4 = new Ex03("또치",24 , 44.2);
		
		// 객체를 저장하는 방법 : 배열 , 컬렉션
		// 1. 배열 : 크기를 지정하면 변경됨
		Ex03[] arr = new Ex03[4];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		// 2. 컬렉션 : 크기지정 없음 , 추가 가능
		HashSet<Ex03> set1 = new HashSet<>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(new Ex03("공실이",24,51.2));
		
		// 이름만 꺼내기
		// 1. 배열 : 일반 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		//   개선된 for문
		System.out.println();
		for (Ex03 k : arr) {
			System.out.println(k.getName());
		}
		
		// 2. 컬렉션 (2가지 방법) : 개선된 for문 , Iterator
		for (Ex03 k : set1) {
			System.out.println(k.getWeight());
		}
		//이터레이터 사용하고 와일문으로 출력
		Iterator<Ex03> it = set1.iterator();
		while (it.hasNext()) {
			Ex03 k = it.next();
			System.out.println(k.getName());
		}
		
	}
}
