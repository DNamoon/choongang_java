package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("ȫ�浿","������","ȫ�浿","�ſ��","���緮","�Ű���");
		
		Stream<String> st = nameList.stream();  //nameList�� �� ȣ��
		st.forEach(n->System.out.print(n+"/"));
		//��°�� >>>
		//ȫ�浿/������/ȫ�浿/�ſ��/���緮/�Ű���/
				
		System.out.println();
		
		nameList.stream()                      //nameList���� �ߺ� �� �����ϱ�
		.distinct()                            //�ߺ� ���� �޼��� - �ߺ��Ǿ��ִ� ȫ�浿�� �ϳ��� ���´�.
		.forEach(n->System.out.print(n+"/"));
		//��°�� >>>
		//ȫ�浿/������/�ſ��/���緮/�Ű���/
		
		System.out.println();
		
		nameList.stream() 						//nameList���� ������ �����ϴ� �� �ҷ�����
		.filter(n->n.startsWith("��"))			//.startWith()�޼��� ���
		.forEach(n->System.out.print(n+"/"));
		//��°��>>>
		//������/�ſ��/�Ű���/
	}

}
