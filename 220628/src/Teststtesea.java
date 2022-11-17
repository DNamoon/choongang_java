
public class Teststtesea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		
		boolean result2 = (obj1 == obj2);
		System.out.println(result2);
		
		
		//A a = new A();
		A b = new A(3,"¥—≈Ÿµµ");
		A c = new A(3,"¥—≈Ÿµµ");
		
		System.out.println(b.equals(c));
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println();
		
		b=c;
		System.out.println(b.equals(c));
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		b.a = 3;
		b.a = 5;
		
		System.out.println();
		System.out.println(b.equals(b));
	}
	
	
	

}
