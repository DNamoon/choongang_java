
public class Test04 {
	public static void main(String[] args) {
		System.out.println(3%2);
		System.out.println(5%4);
		int x = 3%2;
		int y = 5%3;
		
		System.out.println(x == 1 || y == 1);
		System.out.println(x == 1 | y == 1);
		System.out.println(x == 1 && y == 1);
		System.out.println(x == 1 & y == 1);
	}

}
