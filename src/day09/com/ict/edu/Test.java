package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//상우형꺼  
		// 과제(1)
		System.out.println("=====과제 1번=====");
		System.out.println();
		
        int[][] arr = new int[5][5];

        //         번호, 총점, 평균, 학점, 순위
        int[] p1 = {1, 270, 90, 'A', 1};
        int[] p2 = {2, 210, 70, 'C', 1};
        int[] p3 = {3, 180, 60, 'F', 1};
        int[] p4 = {4, 300, 100, 'A', 1};
        int[] p5 = {5, 285, 95, 'A', 1};
        
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
           
        // p1 ~ p5를 arr[] 배열에 넣은 후, p1 ~ p5의 총점을 비교하여 순위 부분 숫자 더하기. 
        // 완료 
        // 순위를 구하자.
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
        		if (arr[i][1] == arr[j][1]) continue;
        		else if (arr[i][1] < arr[j][1])
    				arr[i][4]++;
        	}
		}
        
//        // 순위 순으로 재정렬 (각 값들의 위치를 순위 순으로 모두 줄짓기)
        // int tmp = 0;

//        for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 1; j < arr.length; j++) {
//				// if (arr[i][4] == arr[j][4]) continue;
//				if (arr[i][4] > arr[j][4])
//					for (int k = 0; k < p1.length; k++) {
//						tmp = arr[i][k];
//						arr[i][k] = arr[j][k];
//						arr[j][k] = tmp;
//					}
//			}
//		}
        
        // 순위 오름차순
        int[][] tmp = new int[5][5];
        // 순위로 오름차순    다중 배열에선 sort 사용 불가능해서 이중 for문 사용
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
                if (arr[i][4] > arr[j][4]) {
                    tmp[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp[i];
                }
            }
        }
        
        // 출력
        // 4, 300, 100, 'A', 1
        // 5, 285, 95, 'A', 2
        // 1, 270, 90, 'A', 3
        // 2, 210, 70, 'C', 4
        // 3, 180, 60, 'F', 5
        System.out.println("번호,총점, 평균,학점,순위");
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i][0] + "  ");	
        	System.out.print(arr[i][1] + "  ");	
        	System.out.print(arr[i][2] + "  ");	
        	System.out.print((char)(arr[i][3]) + "  ");	
        	System.out.print(arr[i][4] + "  ");	
        	System.out.println();
		}
        
        System.out.println();
        System.out.println("=====과제2번=====");

        
        // 과제(2)

        Scanner scan = new Scanner(System.in);
        
        System.out.println("학생 수를 입력하세요 : ");
        
        // 학생수 입력받기
        int students = scan.nextInt();
        int info_counts = 4;
        int info[][] = new int[students][info_counts];

        // 키보드로 번호, 국어, 영어, 수학 받기
        for (int i = 0; i < students; i++) {
        	int j = 0;
    		System.out.println("번호를 입력하세요 : ");
        	info[i][j] = scan.nextInt();
        	j = 1;
    		System.out.println("국어 성적을 입력하세요 : ");
        	info[i][j] = scan.nextInt();
        	j = 2;
        	System.out.println("영어 성적을 입력하세요 : ");
        	info[i][j] = scan.nextInt();
        	j = 3;
        	System.out.println("수학 성적을 입력하세요 : ");
        	info[i][j] = scan.nextInt();
        }
				
        // 총점, 평균, 학점, 순위(초기값 지정)
        double scores[][] = new double[students][info_counts];
        for (int i = 0; i < scores.length; i++) {
        	scores[i][0] = 0; // sum 초기화
        	scores[i][1] = 0.0; // avg 초기화
        	scores[i][2] = 'a'; // grade 초기화
        	scores[i][3] = 1; // place 초기화        	
		}      
        
        // 입력받은 값들 제대로 들어갔는지 확인!
//    	for (int i = 0; i < info.length; i++) {
//    		for (int j = 0; j < info[i].length; j++) {
//				System.out.print(info[i][j] + " ");
//				System.out.println();
//			}
//		}
    
    	// score에 초기화한 값들 재확인!
    	for (int i = 0; i < scores.length; i++) {
    		for (int j = 0; j < scores[i].length; j++) {
    			System.out.print(scores[i][j] + " ");
    		}
    	}
    	
    	// 계산 (총점, 평균, 학점, 순위 구하기)
	    for (int i = 0; i < students; i++) {
	    	scores[i][0] = info[i][1] + info[i][2] + info[i][3];
	    	scores[i][1] = (int)((scores[i][0]/3.0)*10)/10.0;
	    	if (scores[i][1] >= 90)
	    		scores[i][2] = 'A';
	    	else if (scores[i][1] >= 80)
	    		scores[i][2] = 'B';
	    	else if (scores[i][1] >= 70)
	    		scores[i][2] = 'C';
	    	else if (scores[i][1] >= 60)
	    		scores[i][2] = 'D';
	    	for (int j = 0; j < scores.length; j++) {
	      		if (scores[i][0] == scores[j][0]) continue;
	      		else if (scores[i][0] < scores[j][0])
	      			scores[i][3]++;
	    	}		
		}
	    
	 // 출력 (1) - 테스트
        System.out.println("총점, 평균, 학점, 순위");
    	for (int i = 0; i < scores.length; i++) {
    		for (int j = 0; j < scores[i].length; j++) {
    			System.out.print(scores[i][j] + " ");
    		}
		System.out.println();
    	}
	    
	    
	    System.out.println();
	    System.out.println("********************");
	    
    
    	// score에 초기화한 값들 재확인!
//    	for (int i = 0; i < scores.length; i++) {
//    		for (int j = 0; j < scores[i].length; j++) {
//    			System.out.print(scores[i][j] + " ");
//    			System.out.println();
//    		}
//    	}

        double[][] tmp_2 = new double[4][4];
        // 순위로 오름차순    
        for (int i = 0; i < scores.length-1; i++) {
            for (int j = i+1; j < scores.length; j++) {
                // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
                if (scores[i][3] > scores[j][3]) {
                    tmp_2[i] = scores[i];
                    scores[i] = scores[j];
                    scores[j] = scores[i];
                }
            }
        }

        // 출력
        System.out.println("총점, 평균, 학점, 순위");
    	for (int i = 0; i < scores.length; i++) {
    		for (int j = 0; j < scores[i].length; j++) {
    			System.out.print(scores[i][j] + " ");
    		}
		System.out.println();
    	}
	}
}