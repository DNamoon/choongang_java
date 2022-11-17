package test;

public class Q11 {

	public static void main(String[] args) {
		//보기1
		int i = 0;
		int ret = 100 + i++;
		System.out.println(ret);
		System.out.println(i);
		
		System.out.println();
		
		//보기2
		int a = 0;
		int res = 100 + ++a;
		System.out.println(res);
		System.out.println(a);

	}

}
