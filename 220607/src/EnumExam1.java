import java.util.Calendar;

public class EnumExam1 {
	public enum 요일{월,화,수,목,금,토,일}
	
	public static void main(String[] args) {
		//public enum 요일{월,화,수,목,금,토,일}  //메인 메소드 안으로 들어올 수 없대.
				
		//System.out.println(Week.TUESDAY);
		//System.out.println(요일.화);
		
	/*	Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //년
		int month = now.get(Calendar.MONTH) +1;//월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK) ;//요일(1~7)
		int hour = now.get(Calendar.HOUR); //시간
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND);  //초
		
		*/
		
		Week today = null;;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2: 
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4: 
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
