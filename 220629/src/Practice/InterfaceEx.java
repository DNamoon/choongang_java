package Practice;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePractice in = ()-> {System.out.println("람다식");};
		
		InterfacePractice in2 = ()->System.out.println("실행문 하나일때 괄호 생략");
		
		in.method();
		in2.method();
	}

}
