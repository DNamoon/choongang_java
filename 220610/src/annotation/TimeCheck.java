package annotation;

public class TimeCheck {  //������̼��̶� ������ ����.  //����ð� �󸶳� �ɸ��� üũ�غ��°� 
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0L;
		
		for(int i=0;i<100000000;i++) {
			sum = i;
		}
		long end = System.currentTimeMillis();
		System.out.println("����ð�: " + (end-start) + " ms");
		

	}
		
}
		
		

