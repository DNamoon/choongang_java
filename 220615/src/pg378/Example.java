package pg378;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; //�ڵ�����ȯ , �������̽��� �ڽ�Ŭ������ �־���.
		
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;  //�ڵ�����ȯ �Ϸ��� �������̽� Ÿ�� ���Ӱ� �༭ ���� ����ŷ�.
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
