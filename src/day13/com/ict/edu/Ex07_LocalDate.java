package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
public static void main(String[] args) {
	// java version 8.0 이상만 가능
	// LocalDate : 날짜 정보만 필요할 때
	// LocalTime : 시간 정보만 필요할 때
	//
	
	LocalDate cDate = LocalDate.now();
	System.out.println(cDate);
	
	LocalTime cTime = LocalTime.now();
	System.out.println(cTime);

	LocalDateTime cdt = LocalDateTime.now();
	System.out.println(cdt);
	System.out.println();
	
	System.out.println("-- 날짜 --");	
	System.out.println("getYear() : " + cDate.getYear());	// 년도
	System.out.println("getMonth() : " + cDate.getMonth());	// May 
	System.out.println("getMonthValue() : " + cDate.getMonthValue());	// 5월
	System.out.println("getDayOfYear() : " + cDate.getDayOfYear());	//년도에 몇일
	System.out.println("getDayOfMonth() : " + cDate.getDayOfMonth());	//월에 몇일	
	System.out.println("getDayOfWeek() : " + cDate.getDayOfWeek());	//주의 무슨요일(MONDAY)
	System.out.println("isLeapYear() : 윤년여부 :" + cDate.isLeapYear()); //
	System.out.println();
	System.out.println("-- 시간 --");
	System.out.println("getHour() : " + cTime.getHour()); // 시간
	System.out.println("getMinute() : " + cTime.getMinute()); //분
	System.out.println("getSecond() : " + cTime.getSecond()); //초
	// 1970년 1월 1일 UTC의 첫 번째 순간 이후의 현재 시간까지의 나노초를 나타내는 값
	System.out.println("getNano() : " + cTime.getNano());
	System.out.println();
	// 국제 표준 년월일
	System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
	System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:SS")));
	System.out.println();
	
	System.out.println("--- 날짜 차이 계산 ---");
	LocalDate sDate = LocalDate.now();
	LocalDate eDate = LocalDate.of(2023, 06, 15);
	System.out.println(eDate);
	
	Period period = Period.between(sDate, eDate); // sDate부터 eDate까지
	System.out.println(period.getYears()); // 년
	System.out.println(period.getMonths()); // 월 한달이 30일 일때도있고 31일인날도 있어서 생각해서 써야함
	System.out.println(period.getDays());  // 일
	System.out.println(ChronoUnit.DAYS.between(sDate, eDate));// 일로 비교해서 이걸 많이 사용함
	System.out.println();
	
	System.out.println(sDate.plusYears(2));	//현재일로부터 2년 더한 날 나옴 2025-05-15
	System.out.println(sDate.plusMonths(2)); //2달 더한날 나옴 2023-07-15
	System.out.println(sDate.plusDays(16)); // 15일 더한날 나옴 2023-05-30
	
	
	}
}
