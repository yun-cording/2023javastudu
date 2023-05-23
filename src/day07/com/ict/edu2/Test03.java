package day07.com.ict.edu2;

import java.util.Scanner;

public class Test03 {
	{
	String num = "010-9732-9110";
    String answer = "";
    
    for (int i = 0; i < 13; i++) {
        if (i > 3 && i < 8) {
            answer += "*";
        }
        else {
            answer += num.charAt(i);
        }    
    }
    System.out.println(answer);
	}
}