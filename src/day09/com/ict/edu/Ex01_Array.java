
package day09.com.ict.edu;

import java.util.Iterator;

public class Ex01_Array {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아 둔 묶음
		// 반드시 같은 자료형이어야 한다.(단,프로모션, 디모션 가능) 자료형만같으면 된다.
		// 생성할때 반드시 크기를 지정해야한다.
		// 한번 지정된 크기는 변경되지 않는다.
		// 배열 데이터를 추출할때는 일반적을 for문을 사용한다.
		// 배열의 종류 : -1차원 배열과 다차원 배열(배열안에 배열이 존재)
		// -기본 자료형 배열과 참조자료형 배열(객체배열)

		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터저장)
		// 1. 선언 : 자료형[] 이름 ; 또는 자료형 이름[] ;
		// ex) String[] sh ; or String sh1[];

		// 2. 생성 : 이름 = new[배열의 크기 = 방의 수 = length = 길이] ;
		// new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라
		// => 인스턴스 , 객체 생성
		// ex) sh = new String[i];

		// 3. 데이터 저장 : 이름[index= 방 번호 = 위치 = 0부터]
		// 같은 자료형 이어야만 저장 가능 (프로모션,디모션 가능)
		int[] s;
		s = new int[3];
		s[0] = 5;
		s[1] = (int) 5.433; // 디모션 => 형변환 하면 가능
		s[2] = 'z'; // 프로모션
		// s[3]=51; // 실행 오류 (배열크기보다 크면 실행 오류)
		// System.out.println(s[3]); //array index out of---무슨 오류뜸 배열크기 오류
		s[0] = 16; // 배열은 변수와같아서 현재 데이터값을 삭제하고 16이 저장된다.
		System.out.println(s[0]);
		//int[] su4 = {4,3,5,6}; 선언 , 생성 , 저장 한번에 하는 법
		int[] su = new int[3]; //보통 선언 , 생성을 동시에하는걸 많이 사용
		su[1] = (int) 4.43;
		su[0] = 'q';
		su[2] = 325;
		// 배열을 호출하면 주소(생성ID)가 출력
		System.out.println(su); // [I@49e4cb85 배열 주소
		System.out.println(su[0]);
		System.out.println(su[1]);
		for (int i = 0; i < su.length; i++) {
			if(i%2==0) 
				System.out.println(su[i]*10);
			else
				System.out.println(su[i]);
			
		}
		System.out.println("==================================");

		// 개선된 for문 : 배열이나 컬렉션에 주로 사용
		// 배열 전체에 대해서 정보 출력 및 가공 가능
		// 단점 : 특정 몇개나 특정 하나를 별도로 출력하거나 가공할 수 없다.

		// : => 오른쪽 배열을 하나씩 순서대로 왼쪽에 넘긴다.
		// 이런식의 if문은 사용가능 그외에 위에 for문처럼 i 인덱스값을 이용해서 홀수 짝수
		// 구한다던지 이런식의 활용하려면 기존 for문을 사용해야한다.
		for (int k : su) {	
			if(k>90)
			System.out.println(k * 10);
			else
				System.out.println(k);
		}

		
	}
}