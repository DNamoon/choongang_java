package test;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {
	
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		//출력결과
		//java8
		//lambda
		//stream
		//mapping
		
		inputList1.stream()
		.flatMap(d ->Arrays.stream(d.split(" ")))
		.forEach(d ->System.out.println(d));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		//출력결과
		//10,20,30,40,50,60 prinln으로 한줄씩 출력
		//int배열로 새롭게 정의. 반복문 이용해서 새로운 스트림 생성 후 새로운 스트림에서 숫자 하나씩 뽑아오기.
		
		
		//inputList2.stream()
		//.flatMapToInt(d ->Arrays.stream(d.split(", ")))
		//.forEach(d->System.out.println(d));
		
		
	}


}
