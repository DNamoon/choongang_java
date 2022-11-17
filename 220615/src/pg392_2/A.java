package pg392_2;

public class A {
	A() {System.out.println("A 按眉啊 积己凳");}
	
	class B {
		B() {System.out.println("B 按眉啊 积己凳");}
		int field1;
		void method1() {}
	}
	static class C {
		C() {}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}
	void method() {
		class E{}
		class D {
			D(){}
			int field1;
			void method1() {}
		}
	}
}
