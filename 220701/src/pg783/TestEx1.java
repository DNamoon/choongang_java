package pg783;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[] {
				new Student("È«±æµ¿",90),
				new Student("È«±æÃ¶",92) ,
				new Student("È«±æ¼ø",98)
		};
		
		List<Student> ls2 = new ArrayList<Student>();
		ls2.add(new Student("È«±æµ¿",90));
		ls2.add(new Student("È«±æÃ¶",92));
		ls2.add(new Student("È«±æ¼ø",98));
		
		Stream<Student> st = ls2.stream();
		
		List<Student> ls = Arrays.asList(
				new Student("È«±æµ¿",90),
				new Student("È«±æÃ¶",92) ,
				new Student("È«±æ¼ø",98));
		
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
