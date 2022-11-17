package Test;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	//인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//static int field2;
		void method1() {System.out.println("B method1() 메소드 실행");}
		//static void method2() {}
	}	
	
	//정적 멤버 클래스
	static class C{
		C() {System.out.println("C 객체가 생성됨");	}
		int field1;
		static int field2;
		void method1() {System.out.println("C method1() 메소드 실행");}
		static void memthod2() {}
	}
	
	void method() {
		//로컬 클래스
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {System.out.println("D의 method1()메소드 실행");}
			//static void  method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
