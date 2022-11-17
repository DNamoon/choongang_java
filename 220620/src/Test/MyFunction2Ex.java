package Test;

public class MyFunction2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction2 f2 ;
		
		MyFunction2 f3 = new MyFunction2() {
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		System.out.println(f3.method(1, 2));
		
		f2 = (x,y) -> { return x+y;};
		System.out.println(f2.method(2, 3));
		
		f2 = (x,y) -> x+y;
		System.out.println(f2.method(4, 6));

	}

}
