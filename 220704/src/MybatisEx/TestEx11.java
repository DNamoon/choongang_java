package MybatisEx;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class TestEx11 {
	//static List<Student> li = new ArrayList<Student>();
//	static int a ;  // static �ʵ�� �ʱ�ȭ�� �� �ص� �������.
//	static final int b=5;  // final �ʵ�� �ʱ�ȭ�� �� �ϸ� �� �ǰ�.
	
	public static void main(String[] args) throws IOException {
		MyBatisService mm = new MyBatisService();
		
		Path pa = Paths.get("src/MybatisEx/Untitled2.txt");
		Stream<String> st = Files.lines(pa,Charset.defaultCharset());
//		
		
		st.forEach(n-> {
			String[] ss = n.split(" ");
			mm.insertSt(new Student(ss[0],Integer.parseInt(ss[1]),Integer.parseInt(ss[2])));
		});
//		
//		for(int i=0;i<li.size();i++) {
//			System.out.println(li.get(i));
//		}
//		
//		int a = mm.insertSt(new Student(ss[0],Integer.parseInt(ss[1]),Integer.parseInt(ss[2])));
	}
}
