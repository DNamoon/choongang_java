package Practice;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week2 today = null;  // Week2��� ���� Ÿ�� Ŭ���� �־�� �ϳ�.
		
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
		
		System.out.println("���� ����: " + today);
		
		if(today == Week2.SUNDAY) {
			System.out.println("���� 10�ñ��� ���� ��ϴ�.");
		} else {
			System.out.println("���� �Ͼ ���θ� �մϴ�.");
		}
	}

}
