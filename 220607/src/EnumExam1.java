import java.util.Calendar;

public class EnumExam1 {
	public enum ����{��,ȭ,��,��,��,��,��}
	
	public static void main(String[] args) {
		//public enum ����{��,ȭ,��,��,��,��,��}  //���� �޼ҵ� ������ ���� �� ����.
				
		//System.out.println(Week.TUESDAY);
		//System.out.println(����.ȭ);
		
	/*	Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //��
		int month = now.get(Calendar.MONTH) +1;//��(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); //��
		int week = now.get(Calendar.DAY_OF_WEEK) ;//����(1~7)
		int hour = now.get(Calendar.HOUR); //�ð�
		int minute = now.get(Calendar.MINUTE); //��
		int second = now.get(Calendar.SECOND);  //��
		
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
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
