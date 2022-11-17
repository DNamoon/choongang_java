
public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		//double result = x / y;   // 계산결과가 int 값이여서 2가 되나봐. 그래서 result에 들어가는 값은 2.0
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	

}
