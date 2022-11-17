package test;

public class Q1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		System.out.println("바꾸기 전 a 값: " + a+", 바꾸기 전 b 값: "+ b);
		System.out.println();
		c = a;
		a = b;
		b = c;
		System.out.println("바꾼 a 값: " + a + ", 바꾼 b 값: " + b);
	}
}
