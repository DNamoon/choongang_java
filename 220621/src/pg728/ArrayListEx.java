package pg728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {  //ArrayList ¹è¿­ºÒÆíÇØ¼­ »ç¿ëÇÑ´ë.

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<String> aa = new ArrayList();
//		aa.add("È«±æµ¿");
//		aa.add("±è»ç¶û");
//		aa.add("ÀÌÇÏ³ª");
//		
//		List<Integer> bb = new ArrayList();
//		bb.add(100);
//		bb.add(200);
//		bb.add(300);
//		for(int i=0;i<bb.size();i++) {
//			
//			int nn = bb.get(i);
//			System.out.println(nn);
//		}
//		
//		String ss = aa.get(0);
//		System.out.println(ss);
	List<String> list = new ArrayList<String>();
	
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add(2, "Database");
	list.add("iBATIS");
	
	int size = list.size();
	System.out.println("ÃÑ °´Ã¼¼ö: " + size);
	System.out.println();
	
	String skill = list.get(2);
	System.out.println("2: " + skill);
	System.out.println();
	
	for(int i=0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i+":" + str);
	}
	System.out.println();
	
	list.remove(2);
	list.remove(2);
	list.remove("iBATIS");
	
	for(int i=0;i<list.size();i++) {
		String str = list.get(i);
		System.out.println(i+ ":" + str);
	}
	
	}

}





















