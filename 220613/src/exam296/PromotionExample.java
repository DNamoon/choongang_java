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
		
		
		A b22 = new B(); //Ŭ������ ��� . Ŭ���� B�� ��ü�� �����ϴµ� ���� ����� Ŭ���� A��! 
		                 //���� ����� Ŭ���� A��� ���� Ŭ���� A�� �ʵ�� �޼��忡�� ������ �� �ְ� Ŭ���� B ������� ���� x
		                 //�ҷ��� ���� ����ȯ���� �ؾ���!
		                 //�̰� �� ���İ� �����..... ������ �𸣰ڴ�.
		                 //"�̰��� �ڹٴ�" p.309
		                 //"��� ������ �ڽ� ��ü�� ���������� ������ ���� ������ ����� �θ� Ŭ���� ����θ� �����ȴ�."
						 //p.310 "�������̵��� �޼ҵ�� Ÿ�� ��ȯ ���Ŀ��� �ڽ� �޼ҵ尡 ȣ��ȴ�."
		
		System.out.println(a1.name);
		System.out.println(((B)a1).name);
		System.out.println(a1.a);  //��ӹ����ϱ� �θ� �ʵ� ���� ����?
		System.out.println(((B)a1).b);
		
		System.out.println();
		System.out.println(b22.name);
		System.out.println(b22.a);
//		System.out.println(b22.b);
		
		
	}
	

}
