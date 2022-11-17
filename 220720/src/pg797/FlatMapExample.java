package pg797;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		inputList1.stream()
		.flatMap(data->Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30, 40, 50, 60");
		inputList2.stream()
		.flatMapToInt(data -> {
			String[] strArr = data.split(", ");  //이렇게 ", "공백까지 넣어서 구분하니까 23라인에 trim()메서드 안써도 됨
			int[] intArr = new int[strArr.length];
			for(int i =0; i<strArr.length;i++) {
				intArr[i] = Integer.parseInt(strArr[i]);  //책 예제와 다르게 trim()메서드 제거
			}
			return Arrays.stream(intArr);
		})
		.forEach(number->System.out.println(number));
		
		Integer x = 10;
		int y =2;
		
	}

}
