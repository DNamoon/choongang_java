
public class practice {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;

		int a = x++; //x�� a�� ������� �� x = x+1
		// a = x;
		// x = x+1; �� ��������.
		System.out.println("a=" + a);	
		System.out.println("x=" + x);	
		int b = ++x; //x = x+1 �� �� �� x�� b�� �ִ´�. 
		// x = x + 1;
		// b = x;  �̷��� ��������. 
		System.out.println("x=" + x);
		System.out.println("b=" + b);	

	}

}
