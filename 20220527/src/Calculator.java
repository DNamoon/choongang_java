
public class Calculator {
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		//double result = x / y;   // ������� int ���̿��� 2�� �ǳ���. �׷��� result�� ���� ���� 2.0
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	

}
