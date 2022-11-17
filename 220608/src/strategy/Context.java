package strategy;

public class Context {
	private Strategy st; //Strategy 인터페이스 타입 //private 다른 객체에서 이 객체에 멤버 필드에 접근 못 하게 하겠다.
	
	Context(Strategy st) {
		this.st = st;
	}
	
	public int execute(int num1, int num2) { //이건 함수! 이제 이거는 알잖아.
		return st.doOperation(num1, num2);
	}
}
