
public class practice {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;

		int a = x++; //x를 a에 집어넣은 후 x = x+1
		// a = x;
		// x = x+1; 로 생각하자.
		System.out.println("a=" + a);	
		System.out.println("x=" + x);	
		int b = ++x; //x = x+1 을 한 후 x를 b에 넣는다. 
		// x = x + 1;
		// b = x;  이렇게 생각하자. 
		System.out.println("x=" + x);
		System.out.println("b=" + b);	

	}

}
