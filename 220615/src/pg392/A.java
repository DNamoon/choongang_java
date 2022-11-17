package pg392;

public class A {
	//B b;
	static int field2; //바깥에는 들어간다.
	
	class B{
		public int field1;
		B(){}
		//static int field2;  //내부 클래스 안에는 static 멤버 못 들어간다.
		void method1() {
			
		}
		
	}
}
 