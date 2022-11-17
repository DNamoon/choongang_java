package pg397;

public class A {
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	static class B{
		void method() {
			/*A a = new A();
			a.field1 = 10;
			a.method1();*/
			
			//field1 =10;
			//method1;
			
			field2 = 10;
			method2();
		}
	}

}
