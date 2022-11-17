package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q17 {

	public static void main(String[] args) {
		int arr[] = new int[7];
		int len = arr.length;
		System.out.println(len);
		int arr2[] = {1,2,3,4,5,6,7};
		
		int arr3[] = new int[] {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr.length);
		List<String> a = (Arrays.asList("¾È³ç","ÀÚ¹Ù"	));
		System.out.println(a);
		List<Integer> b = Arrays.asList(1,2,3);
		List<String> c = new ArrayList();
		c.add("ÀÚ¹Ù");
		c.add("¾È³ç");
		c.remove(0);
		
		System.out.println(c);
		System.out.println(b);
		
		System.out.println();
		
		List<Test> aaaa = new ArrayList();
		
		aaaa.add(new Test(3));
		aaaa.add(new Test(5));
		
		Test test = aaaa.get(0);
		Test test2 = aaaa.get(1);
		System.out.println(test.a);
		System.out.println(test2.a);
	
		
		

	}

}
