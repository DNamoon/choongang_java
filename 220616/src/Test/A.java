package Test;

public class A {
	A(){System.out.println("A ��ü�� ������");}
	
	//�ν��Ͻ� ��� Ŭ����
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		//static int field2;
		void method1() {System.out.println("B method1() �޼ҵ� ����");}
		//static void method2() {}
	}	
	
	//���� ��� Ŭ����
	static class C{
		C() {System.out.println("C ��ü�� ������");	}
		int field1;
		static int field2;
		void method1() {System.out.println("C method1() �޼ҵ� ����");}
		static void memthod2() {}
	}
	
	void method() {
		//���� Ŭ����
		class D{
			D(){System.out.println("D��ü�� ������");}
			int field1;
			//static int field2;
			void method1() {System.out.println("D�� method1()�޼ҵ� ����");}
			//static void  method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
