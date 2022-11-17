package pg399;

public class Outter {
	public void method1(final int arg) {
		final int field = 1;
		//arg = 100;
		
		//localVariable = 10;
		class Inner{
			public void method() {
				int result = arg + field;
				System.out.println(result);
			} 
		}
		
		
	}
	
	
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		
		//localVariable = 10;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
		
	}
	
	public void method(final int arg) {
		
	}
	
	public static void main(String[] args) {
		Outter k = new Outter();
		k.method1(3);
	}
}
