package pg797;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestEx1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//arr.stream();  //int 배열, 스트림 사용 불가하다. intStream으로 만들어줘야 한다.
		
		IntStream is = Arrays.stream(arr);
		is.asDoubleStream().forEach(n->System.out.println(n));
		
		System.out.println();
		
		String[] sa = {"홍","김","신","정"};
		Arrays.asList(sa).stream()//StringStream은 따로 없어서 String 배열은 
								  //이런식으로 Arrays.asList().steam() 사용
		.forEach(n->System.out.println(n));
		
	}

}
