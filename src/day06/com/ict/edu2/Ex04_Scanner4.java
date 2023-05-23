package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
//	
//	System.out.println("원하는 반복 횟수 : ");
//	int su = scan.nextInt();
//	
//	System.out.println("원하는 단어 : ");
//	String str = scan.next();
//	
////	for(int i=0 ; i<su ; i++) {
////		System.out.println(str);
////	}
//	int i = 0;
//	while(i<su) {
//		System.out.println(str);
//		i++;
//	}
//	원하는 회수를 입력 받고 
//	숫자를 입력 받아서 
//	입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
	System.out.print("원하는 횟수를 입력하시오 : ");
	int su1 = scan.nextInt();
	System.out.print("원하는 숫자를 입력하시오 : ");
	int su2 = scan.nextInt();
	
	String res = "" ; 
	
	if(su2%2==0) {
		res = "짝수";
	}else {
		res = "홀수";
	}
	
	for(int e = 0; e<su1 ; e++) {
		System.out.println(su2+"를 "+su1+"번 "+"나타내고 "+su2+"="+res);
	}
	
	
	System.out.println("=====================================");
//	이름, 국어, 영어, 수학를 입력 받아서 
//	총점, 평균, 학점을 구하고 
//	이름, 총점, 평균, 학점을 출력하는 코딩 
//	(평균은 소숫점 첫째자리까지 구하자)
	System.out.print("이름은 : ");
	String name = scan.next();
	System.out.print("국어점수는 : ");
	int kor = scan.nextInt();
	System.out.print("영어점수는 : ");
	int eng = scan.nextInt();
	System.out.print("수학점수는 : ");
	int math = scan.nextInt();
	int sum = kor + eng + math ;
	double avg = (int)(sum/3.0*10);
	avg = avg/10;
	String res1 = "";
	if(avg>=90) {
		res1="A학점";
	}else if (avg>=80) {
		res1="B학점";
	}else if (avg>=70) {
		res1="C학점";
	}else {
		res1="F학점";
	}
	System.out.println("이름 : "+ name + " , 총점 : "+ sum + " , 평균 : " + avg + " , 학점 : " + res1);
	System.out.println("=====================================");
//	첫번째 숫자 받기
//	두번째 숫자 받기
//	연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
//	실수형으로 결과 받기
	int res2 = 0;
	System.out.print("첫 번째 숫자 입력 : ");
	int c1 = scan.nextInt();
	System.out.print("두 번째 숫자 입력 : ");
	int c2 = scan.nextInt();
	System.out.print("연산자 입력 :  \n 1 => + \n 2 => - \n 3 => * \n 4 => / \n>>>>  ");
	int c3 = scan.nextInt();
	if(c3==1) {
		res2 = c1 + c2;
		System.out.println(c1 + " + "+c2 + " = " + res2);
	}else if (c3==2) {
		res2 = c1 - c2;
		System.out.println(c1 + " - "+ c2 + " = " + res2);
	}else if (c3==3) {
		res2 = c1 * c2;
		System.out.println(c1 + " * "+c2 + " = " + res2);
	}else if (c3==4) {
		double res3 = (int)(((double)c1 / c2)*10);
		res3 = res3/10;
		System.out.println(c1 + " / "+c2 + " = " + res3);
	}
}

}
