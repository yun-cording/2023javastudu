package day07.com.ict.edu2;

import java.util.Scanner;
public class Sample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째자리까지 구하자)
		
		int count = 0; // 전체횟수
		int even = 0; // 짝수횟수
		int s1 = 1; // if문에 걸리지 않기 위해서 시작을 1로 설정
		while(true) {
			if (s1 == 2) { // 처음 시작의 경우 s1이 1이기 때문에 걸리지 않고 바로 숫자 입력으로 이동
				break; // 입력받은 숫자가 2일 경우 while문을 탈출하여 결과를 출력해줌
			} else if (s1 != 1 && s1 != 2) { // 1도 아니고 2도 아닌 수를 입력했을 경우에 안에 있는 코드 실행
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.(1.yes, 2.no)>>");
				s1 = scan.nextInt();
				//숫자를 입력받고 나면 continue로 인해서 while문 시작 지점으로 바로 이동해서 if문 부터 다시 검사함.
				//그렇기 때문에 1,2를 제외한 수를 입력했을경우 계속 잘못 입력했다는 문구가 출력됨.
				continue;
			}
			count++;
			System.out.print("숫자입력 : ");
			int su = scan.nextInt();
			String str = "";
			if(su%2 ==0) {
				str = "짝수"; 
				even++; 
			}else {
				str = "홀수";
			}
			System.out.println(su + "는" + str + "입니다.");
			System.out.print("계속할까요?(1.yes, 2.no) >>");
			s1 = scan.nextInt(); // 숫자 입력후 바로 while문 시작으로 돌아감			
		}
		double per = (even / (count*1.0))*100 ;
		System.out.println("전체 횟수 : " + count);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("짝수가 나오는 퍼센트 : " + (int)(per*10)/10.0 + "%");
	}
}