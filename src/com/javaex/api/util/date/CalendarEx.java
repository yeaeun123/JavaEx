package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 캘린더 불러오기 : .getInstance()를 통해 인스턴스 확보 가능
		Calendar now = Calendar.getInstance(); // 현재 날짜와 시간
		Calendar custom = Calendar.getInstance();

		// 시간 정보 설정
		custom.set(2012, 8, 24); // 2012년 9월 24일 (월 정보는 0부터라서 +1)

		// 상수를 이용한 날짜 정보 얻어오기
		/// 년, 월, 일
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH) + 1; // 1월은 0부터 시작임 +1필수
		int nowDate = now.get(Calendar.DATE);

		// 출력
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", nowYear, nowMonth, nowDate);

		Calendar future = Calendar.getInstance(); // 현재 시간

		// 미래로 여행을 떠나보자
		future.add(Calendar.YEAR, 10); // 현재 날짜 정보에 10년 더함
		System.out.printf(" 10년 후 오늘은 %d년 %d월 %d일 입니다.%n", 
				future.get(Calendar.YEAR), 
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		// 요일 정보 확인
		int dow = future.get(Calendar.DAY_OF_WEEK); // 요일 정보 확인
		System.out.println(dow); // 월요일 -> 숫자 1=일요일 2=월요일
		

	}

}
