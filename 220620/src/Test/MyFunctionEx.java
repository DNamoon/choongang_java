package Test;

public class MyFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction f ;
		
		MyFunction f1 = new MyFunction() {
			@Override
			public void method(int x) {
				System.out.println("�͸�����ü ���� ���");
			}
		};
		f1.method(1);
		
		
		f = (x) -> { System.out.println("���ٽ� ��� 1");};
		f.method(2);
		
		f = x -> System.out.println("���ٽ� ��� 2, �Ű����� 1������ ��ȣ ����, ���๮ �Ѱ����� �߰�ȣ ����");
		f.method(3);
	}

}
