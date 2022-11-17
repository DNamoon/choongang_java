package factory;

public class CalFactory {
	void printResult(String op,int x, int y) {
		Calculator cal = null; //Calculator 인터페이스의 객체?
		if(op.equals("+")) {
			cal = new Plus();
			
		} else if(op.equals("-")) {
			cal = new Minus();
			
		} else if(op.equals("*")) {
			cal = new Multi();
		} else if(op.equals("/")) {
			cal = new Divide();
		}
		cal.execute(x, y);
		
	}

}
