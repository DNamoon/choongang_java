package Test;

public class Main {

	public static void main(String[] args) {
		/*A.C c = new A.C();     //���� ���Ŭ���� �ٱ� Ŭ���� ��ü �������� ��밡�� Ȯ���ϰ� �;���.
		System.out.println(c.field1=3);*/
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.memthod2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ����
		a.method();
		
		
	}

}
