package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다 , 영국 , 스위스의 수도가 각각 HashMap에 저장시키고
		// ,원하는 나라가 key값이 되어 , 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		HashMap<String, String> map = new HashMap<>();
		map.put("스위스", "베른");
		map.put("대한민국", "서울");
		map.put("일본", "도쿄");
		map.put("중국", "상하이");
		map.put("미국", "워싱턴");
		map.put("캐나다", "오타와");
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.println("나라이름을 입력하세요\n");
			String str = scan.next();
			String str1 = map.get(str);
//			while (true) {
				if (map.containsKey(str)) {
					System.out.println(str1);
				}
					else {
					System.out.println("모르는 나라입니다.");
				}
//				break;
//			} // 안쪽 while문 끝
			while (true) {
				System.out.println("계속하시겠습니까?\n(Y/N)");
				str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			}
		} // 바깥while문 끝
	}
}