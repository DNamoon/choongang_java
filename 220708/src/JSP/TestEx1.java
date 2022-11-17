package JSP;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;

public class TestEx1 {

	public static void main(String[] args) {
		Vector<String> vv = new Vector<String>();
		vv.add("È«±æµ¿");
		vv.add("È«±æ¼ø");
		vv.add("È«±æÃ¶");
		
		Stream<String> st = vv.stream();
		st.forEach(name -> System.out.println(name));
		
		System.out.println("==============");
		
		Iterator<String> iterator = vv.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("==============");
		
		Enumeration<String> es = vv.elements();
		while(es.hasMoreElements()) {
			String ss = es.nextElement();
			System.out.println(ss);
		}
	}

}
