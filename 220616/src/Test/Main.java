package Test;

public class Main {

	public static void main(String[] args) {
		/*A.C c = new A.C();     //정적 멤버클래스 바깥 클래스 객체 생성없이 사용가능 확인하고 싶었음.
		System.out.println(c.field1=3);*/
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.memthod2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호춫ㄹ
		a.method();
		
		
	}

}
