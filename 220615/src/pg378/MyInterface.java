package pg378;

public interface MyInterface {
	public void mthod1();
	//public void method2();  // ���߿� �߰��� �� �̷������� �ϸ� ���� �����.
	public default void method2(){  //default �� �ϸ� �ڿ������� ���� ������ �� �ִ�.
		System.out.println("MyInterface-method2 ����");
	}
}
