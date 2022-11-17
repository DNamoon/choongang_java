package strategy;

public class Context {
	private Strategy st; //Strategy �������̽� Ÿ�� //private �ٸ� ��ü���� �� ��ü�� ��� �ʵ忡 ���� �� �ϰ� �ϰڴ�.
	
	Context(Strategy st) {
		this.st = st;
	}
	
	public int execute(int num1, int num2) { //�̰� �Լ�! ���� �̰Ŵ� ���ݾ�.
		return st.doOperation(num1, num2);
	}
}
