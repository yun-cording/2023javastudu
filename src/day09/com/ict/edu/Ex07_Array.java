package day09.com.ict.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {
		// 가장 큰값과 가장 작은 값 구하기
		int[] su = {90,87,-20,120,67,23,40,53};
		
		Arrays.sort(su);

		// 오름차순
		
		System.out.println("가장 작은 값 : " + su[0]); //가장 작은값
		System.out.println("가장 큰 값 : " + su[su.length-1]);// 가장큰값
		// -1해줘야함 . 인덱스 값과 길이 값은 1차이가 나기 때문
		// 가변길이 고정길이
		

	}
}
