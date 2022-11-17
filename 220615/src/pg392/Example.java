package pg392;

public class Example {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // 내부 클래스 객체 생성하는 방법인가봐. 
		                   // 중첩 클래스 B의 객체를 만들기 위해서는 먼저 외부 클래서 A의 객체를 생성해야 한다.
		//b.field2 = 10;
		b.method1();
	}
}
