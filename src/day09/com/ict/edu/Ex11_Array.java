package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex11_Array {
public static void main(String[] args) {

    int[][] arr = new int[5][5];
    int[] p1 = {1, 270 , 90 , 'A' , 1};
    int[] p2 = {2, 210 , 70 , 'C' , 1};
    int[] p3 = {3, 180 , 60 , 'F' , 1};
    int[] p4 = {4, 300 , 100 , 'A' , 1};
    int[] p5 = {5, 285 , 95 , 'A' , 1};
    arr[0] = p1;
    arr[1] = p2;
    arr[2] = p3;
    arr[3] = p4;
    arr[4] = p5;
    
    // 순위를 구하자 이중배열에서 합산값 으로 비교하기때문에 [i][2] 비교할값은 2로 고정
    for(int i =0 ; i<arr.length;i++) {
        for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][2]==arr[j][2]) {
                    continue;
            }else if(arr[i][2]<arr[j][2]) {
                arr[i][4]++;
            }
        }
    }
    
    int[] tmp = new int[5];
    // 순위로 오름차순    다중 배열에선 sort 사용 불가능해서 이중 for문 사용
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
        	if(arr[i][4]==arr[j][4])continue;
            else if (arr[i][4] > arr[j][4]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    System.out.println("번호\t총점\t평균\t학점\t순위\t");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i][0]+"\t");
        System.out.print(arr[i][1]+"\t");
        System.out.print(arr[i][2]+"\t");
        System.out.print((char)arr[i][3]+"\t");
        System.out.print(arr[i][4]+"\t");
        System.out.println();
    }
}
}
    
    // 출력 
    /*
    4, 300, 100, 'A' , 1
    5, 285, 95 , 'A' , 2
    1, 270, 90 , 'A' , 3
    2, 210, 70 , 'C' , 4
    3, 180, 60 , 'F' , 5
    */