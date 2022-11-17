package test;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동",Member.MALE,33),
			new Member("신윤복",Member.FEMALE,15),
			new Member("이순신",Member.MALE,25)
			); 
		
		//스트림에서 중간처리와 최종처리를 거쳐서 생성한 리스트에서 남자 평균 나이를 구하는 과정
		double ageAvg = list.stream()                   //리스트 stream()메서드 로 부르기
				.filter(m->m.getSex() == Member.MALE)   //중간처리 - 성별 구별하기
				.mapToInt(Member :: getAge)             //중간처리 - Member 클래스의 getAge()
				                                        //메서드 활용하여 선별한 남자 나이 가져오기
				.average()								//가져온 나이 평균 구하기
				.getAsDouble();							//구한 평균 Double 값으로 나타내기	
		
		System.out.println("남자 나이 평균은 " + ageAvg + "입니다.");
		//출력결과 >>>
		//남자 나이 평균은 29.0입니다.
	}

}
