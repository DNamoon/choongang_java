package pg797;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestEx1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//arr.stream();  //int �迭, ��Ʈ�� ��� �Ұ��ϴ�. intStream���� �������� �Ѵ�.
		
		IntStream is = Arrays.stream(arr);
		is.asDoubleStream().forEach(n->System.out.println(n));
		
		System.out.println();
		
		String[] sa = {"ȫ","��","��","��"};
		Arrays.asList(sa).stream()//StringStream�� ���� ��� String �迭�� 
								  //�̷������� Arrays.asList().steam() ���
		.forEach(n->System.out.println(n));
		
	}

}
