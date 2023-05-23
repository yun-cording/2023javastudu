package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Sam_homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put("스위스", "베른");
		map.put("대한민국", "서울");
		map.put("일본", "도쿄");
		map.put("중국", "상하이");
		map.put("미국", "워싱턴");
		map.put("캐나다", "오타와");

		Set<String> keys = map.keySet();
		esc: while (true) {
			System.out.println("나라 입력 : ");
			String str = scan.next();

			if (keys.contains(str)) {
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다.");
			} else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			while(true) {
				System.out.println("계속할까요?(y/n) >>>");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("잘못입력하셨습니다");
					continue;
				}
			}
		}
	}
}
