package pg743;

import java.util.HashMap;
import java.util.Map;

public class TestEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ȫ�浿",85);
		map.put("ȫ��ö",90);
		map.put("ȫ���",95);
		
		int val = map.get("ȫ��ö");
		System.out.println(val);
	}
	

}
