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
			//System.out.println(a); // 정적 멤버클래스는 바깥 클래스의 객체가 생성 안 돼도 사용할 수 있어야 한다.
								   // 근데 바깥 클래스의 인스턴스 필드 값은 바깥 클래스의 객체가 생성되어야 사용할 수 있으므로
			                       // 정적 멤버클래스의 안에서 사용할 수 없다.
			                       // ->정적 멤버클래스 안에서 바깥 클래스의 인스턴스 멤버를 사용할 수 없다..
			System.out.println(b);
		}
	}
	
	void method() {
		localClass local = new localClass();
		localClass.B bb = local.new B();
		//localClass.class.b ;
	}
	

}
