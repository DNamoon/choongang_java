package pg797;

import java.util.Arrays;
import java.util.OptionalDouble;

public class LoopingExam {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		double total = Arrays.stream(intArr)
				.peek(n->System.out.println(n))
				.average().getAsDouble();
		System.out.println("ЦђБе: " + total);
		
	}

}
