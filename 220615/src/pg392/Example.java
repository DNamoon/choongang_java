package pg392;

public class Example {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // ���� Ŭ���� ��ü �����ϴ� ����ΰ���. 
		                   // ��ø Ŭ���� B�� ��ü�� ����� ���ؼ��� ���� �ܺ� Ŭ���� A�� ��ü�� �����ؾ� �Ѵ�.
		//b.field2 = 10;
		b.method1();
	}
}
