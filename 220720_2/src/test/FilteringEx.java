package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("홍길동","신윤복","홍길동","신용권","최재량","신건희");
		
		Stream<String> st = nameList.stream();  //nameList를 다 호출
		st.forEach(n->System.out.print(n+"/"));
		//출력결과 >>>
		//홍길동/신윤복/홍길동/신용권/최재량/신건희/
				
		System.out.println();
		
		nameList.stream()                      //nameList에서 중복 값 제거하기
		.distinct()                            //중복 제거 메서드 - 중복되어있던 홍길동이 하나만 남는다.
		.forEach(n->System.out.print(n+"/"));
		//출력결과 >>>
		//홍길동/신윤복/신용권/최재량/신건희/
		
		System.out.println();
		
		nameList.stream() 						//nameList에서 신으로 시작하는 값 불러오기
		.filter(n->n.startsWith("신"))			//.startWith()메서드 사용
		.forEach(n->System.out.print(n+"/"));
		//출력결과>>>
		//신윤복/신용권/신건희/
	}

}
