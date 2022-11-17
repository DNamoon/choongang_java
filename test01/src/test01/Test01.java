package test01;

public class Test01{
	public static void main(String[] args) {
		System.out.print("Hello, welcome to the java world!\n");
		System.out.println("안녕, 자바!");
		/*코드마다 다 다르다고 
		 * 현업가면 주석달라고 그렇게 잔소리를 듣는대.
		 */
		int x = 1;
		int y = 2;
		int result = x + y;
		System.out.println(result);
		
		int v1 = 10;
		int v2 = 010;
		int v3 = 0x10;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		String a = "안녕";
		String b = "하세요.";
		
		System.out.println(a+b);
	}
}