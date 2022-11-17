package test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
	//배열로 스트림 불러보기.
	public static void main(String[] args) {
		String[] name = new String[] { "홍길동", "신윤복", "이순신", "강감찬"};
		
		Stream<String> st = Arrays.stream(name);
		st.forEach(n->System.out.print(n+"/ "));
		
		System.out.println();
		int[] age = new int[] {10,20,22,34,55};
		IntStream ag = Arrays.stream(age);
		ag.forEach(a->System.out.print(a+"/ "));
		
		
	}
}
