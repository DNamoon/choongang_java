package test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
	//�迭�� ��Ʈ�� �ҷ�����.
	public static void main(String[] args) {
		String[] name = new String[] { "ȫ�浿", "������", "�̼���", "������"};
		
		Stream<String> st = Arrays.stream(name);
		st.forEach(n->System.out.print(n+"/ "));
		
		System.out.println();
		int[] age = new int[] {10,20,22,34,55};
		IntStream ag = Arrays.stream(age);
		ag.forEach(a->System.out.print(a+"/ "));
		
		
	}
}
