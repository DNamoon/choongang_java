package pg378;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; //자동형변환 , 인터페이스에 자식클래스를 넣었다.
		
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;  //자동형변환 하려고 인터페이스 타입 새롭게 줘서 변수 만든거래.
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
