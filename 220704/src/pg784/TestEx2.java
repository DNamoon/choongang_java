package pg784;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestEx2 {
	
	static List<Student> li = new ArrayList<Student>();
	
	public static void main(String[] args) throws IOException {
		Path pa = Paths.get("src/pg784/test.txt");
		Stream<String> st = Files.lines(pa,Charset.defaultCharset());
		
		//st.forEach(System.out :: println);
		
		st.forEach(n-> {
			String[] ss = n.split(" ");
			li.add(new Student(ss[0],Integer.parseInt(ss[1])));
		});
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(Student dd: li) {
			System.out.println(dd);
		}
		System.out.println();
		
		Stream<Student> sss = li.stream();
		double avg2 = sss.mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg2);
	}
}
