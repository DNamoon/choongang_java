package Practice;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePractice in = ()-> {System.out.println("���ٽ�");};
		
		InterfacePractice in2 = ()->System.out.println("���๮ �ϳ��϶� ��ȣ ����");
		
		in.method();
		in2.method();
	}

}
