package util;

import java.util.Arrays;
import java.util.List;

public class SumTest {

	public static void main(String[] args) {
		List<Long> values = Arrays.asList(1L,2L,5L,10L);
		long result = CalUtil.sum(values);
		System.out.println(result);

	}

}
