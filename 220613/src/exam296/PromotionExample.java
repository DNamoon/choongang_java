package exam296;

class A{
	int a =1;
	String name = "a";
}
class B extends A{
	int b = 2;
	String name = "b";
}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		B b = new B();
		A a1 = b;
		
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.name);
		
		
		A b22 = new B(); //클래스간 상속 . 클래스 B의 객체를 생성하는데 접근 방법은 클래스 A로! 
		                 //접근 방법이 클래스 A라는 말은 클래스 A의 필드와 메서드에만 접근할 수 있고 클래스 B 멤버에는 접근 x
		                 //할려면 강제 형변환으로 해야함!
		                 //이걸 왜 쓰냐고 물어보면..... 아직은 모르겠다.
		                 //"이것이 자바다" p.309
		                 //"비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로만 한정된다."
						 //p.310 "오버라이딩된 메소드는 타입 변환 이후에도 자식 메소드가 호출된다."
		
		System.out.println(a1.name);
		System.out.println(((B)a1).name);
		System.out.println(a1.a);  //상속받으니까 부모 필드 접근 가능?
		System.out.println(((B)a1).b);
		
		System.out.println();
		System.out.println(b22.name);
		System.out.println(b22.a);
//		System.out.println(b22.b);
		
		
	}
	

}
