package Practice;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week2 today = null;  // Week2라는 열거 타입 클래스 있어야 하네.
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today  = Week2.SUNDAY; break;
		case 2:
			today = Week2.MONDAY; break;
		case 3:
			today = Week2.TUESDAY; break;
		case 4:
			today = Week2.WEDNESDAY; break;
		case 5:
			today = Week2.THURSDAY; break;
		case 6:
			today = Week2.FRIDAY; break;
		case 7:
			today = Week2.SUNDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week2.SUNDAY) {
			System.out.println("오전 10시까지 잠을 잡니다.");
		} else {
			System.out.println("일찍 일어나 공부를 합니다.");
		}
	}

}
