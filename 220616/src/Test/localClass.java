package Test;

public class localClass {
	
	int a = 3;
	static int b = 5;
	
	class B{
		//a;
		//b;
		void print() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	static class C {
		//a;
		//b;
		void print() {
			//System.out.println(a); // ���� ���Ŭ������ �ٱ� Ŭ������ ��ü�� ���� �� �ŵ� ����� �� �־�� �Ѵ�.
								   // �ٵ� �ٱ� Ŭ������ �ν��Ͻ� �ʵ� ���� �ٱ� Ŭ������ ��ü�� �����Ǿ�� ����� �� �����Ƿ�
			                       // ���� ���Ŭ������ �ȿ��� ����� �� ����.
			                       // ->���� ���Ŭ���� �ȿ��� �ٱ� Ŭ������ �ν��Ͻ� ����� ����� �� ����..
			System.out.println(b);
		}
	}
	
	void method() {
		localClass local = new localClass();
		localClass.B bb = local.new B();
		//localClass.class.b ;
	}
	

}
