package common2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestEx2 {
	
	//static List<Student> li = new ArrayList<Student>();
	
	public static void main(String[] args) throws IOException {
		
		MyBatisService ms = new MyBatisService();
		
		Path pa = Paths.get("src/common2/test.txt");
		Stream<String> st = Files.lines(pa,Charset.defaultCharset());
				
		st.forEach(n-> {
			String[] ss = n.split(" ");
			ms.insertSt(new Student(ss[0],Integer.parseInt(ss[1])));
			//li.add(new Student(ss[0],Integer.parseInt(ss[1])));
		});
		

	}
}
