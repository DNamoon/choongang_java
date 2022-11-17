package util;

import java.util.ArrayList;
import java.util.List;

public class CalUtil {
	public static long sum(List<Long> values) {
		long sum = 0L;
		for(long num : values) {
			sum += num;
		}
		return sum;
	}
}
