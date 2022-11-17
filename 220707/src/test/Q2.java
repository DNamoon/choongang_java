package test;

public class Q2 {

	public static void main(String[] args) {
		//구구단을 출려하는 프로그램
		//이중 for문
		for(int i=2;i<10;i++) {
			System.out.println("============"+i+"단============");
			for(int j=1;j<10;j++) {
				System.out.println(i+" X " + j + " = " + i*j);
			}
		}
		
		//while문
		int a = 2;
		int b = 1;
		while(a<10) {
			System.out.println("============"+a+"단============");
			while(b<10) {
				
				System.out.println(a+" X " + b + " = " + a*b);
				b++;
			}
			a++;
			b=1;
		}
		
	}

}
