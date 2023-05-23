package day11.com.ict.edu;

import java.util.Scanner;

public class test_main {
public static void main(String[] args) {
	/*총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
//  이름, 국어, 영어, 수학를 받아서 
//  총점, 평균, 학점, 순위를 구하고 
//  순위 기준으로 오름차순으로 정렬하여 
//  출력하는 main 메서드를 가지는 클래스를 만들어라 
//  단, 처리는 2차원배열을 이용해라
//  */
  
  Scanner scan = new Scanner(System.in);
  System.out.print("학생 수를 입력하세요 : ");
  int su = scan.nextInt();
  
  
  String[][] str = new String[su][2];
  double[][] sc = new double[su][6];
  for (int i = 0; i < str.length; i++) {
      test_method pe = new test_method();
      System.out.print("이름 : ");
      pe.name = scan.next();

      System.out.print("국어 : ");
      pe.kor = scan.nextInt();

      System.out.print("영어 : ");
      pe.eng = scan.nextInt();

      System.out.print("수학 : ");
      pe.math = scan.nextInt();
      
      pe.getSum();
      pe.getAvg();
      pe.getHak();
      
      pe.rank = 1;
      str[i][0] = pe.name;
      str[i][1] = pe.hak;
      sc[i][0] = pe.kor;
      sc[i][1] = pe.eng;
      sc[i][2] = pe.math;
      sc[i][3] = pe.sum;
      sc[i][4] = pe.avg;
      sc[i][5] = pe.rank;
      }
  // 순위
  for (int i = 0; i < sc.length; i++) {
      for (int j = 0; j < sc.length; j++) {
          if (sc[i][3] == sc[j][3])
              continue;
          else if (sc[i][3] < sc[j][3])
              sc[j][5]++;
      }
  }
  // 순위 순서매기기
  double[][] arr = new double[su][6];
	for (int i = 0; i < arr.length; i++) {
		arr[(int) (sc[i][5] -1) ] =sc[i];
	}
	
	System.out.println("이름\t총점\t평균\t학점\t순위");
  for (int i = 0; i < arr.length; i++) {
	System.out.print(str[i][0]+"\t");
	System.out.print((int)arr[i][3]+"\t");
	System.out.print(arr[i][4]+"\t");
	System.out.print(str[i][1]+"\t");
	System.out.println((int)arr[i][5]);
}	
}
}
