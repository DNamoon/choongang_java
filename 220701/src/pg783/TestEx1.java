package pg783;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[] {
				new Student("ȫ�浿",90),
				new Student("ȫ��ö",92) ,
				new Student("ȫ���",98)
		};
		
		List<Student> ls2 = new ArrayList<Student>();
		ls2.add(new Student("ȫ�浿",90));
		ls2.add(new Student("ȫ��ö",92));
		ls2.add(new Student("ȫ���",98));
		
		Stream<Student> st = ls2.stream();
		
		List<Student> ls = Arrays.asList(
				new Student("ȫ�浿",90),
				new Student("ȫ��ö",92) ,
				new Student("ȫ���",98));
		
		//Stream<Student> st = ls.stream();
//		st.forEach(n-> {
//			System.out.println(n.getName());
//		});
		
		st.forEach(n-> {
			System.out.println(n);
		});
		
		
		//Iterator<String> it = ls.iterator();
//		while(it.hasNext()) {
//			String nn = it.next();
//			System.out.println(nn);
//		}
	}

}
