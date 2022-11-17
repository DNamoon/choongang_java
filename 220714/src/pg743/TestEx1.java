package pg743;

import java.util.HashMap;
import java.util.Map;

public class TestEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("È«±æµ¿",85);
		map.put("È«±æÃ¶",90);
		map.put("È«±æ¼Õ",95);
		
		int val = map.get("È«±æÃ¶");
		System.out.println(val);
	}
	

}
