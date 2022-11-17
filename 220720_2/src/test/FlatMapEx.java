package test;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {
	
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		//��°��
		//java8
		//lambda
		//stream
		//mapping
		
		inputList1.stream()
		.flatMap(d ->Arrays.stream(d.split(" ")))
		.forEach(d ->System.out.println(d));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		//��°��
		//10,20,30,40,50,60 prinln���� ���پ� ���
		//int�迭�� ���Ӱ� ����. �ݺ��� �̿��ؼ� ���ο� ��Ʈ�� ���� �� ���ο� ��Ʈ������ ���� �ϳ��� �̾ƿ���.
		
		
		//inputList2.stream()
		//.flatMapToInt(d ->Arrays.stream(d.split(", ")))
		//.forEach(d->System.out.println(d));
		
		
	}


}
