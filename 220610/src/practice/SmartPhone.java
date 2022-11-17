package practice;

public class SmartPhone extends Phone {
	//p.333 궁금한대?
	//생성자
	public SmartPhone(String owner) {  // 생성자를 받는다는게 무슨 의미일까? 새롭게 생성자 선언한거 아닌가?
		super(owner);
	}
	
	//메소드
	public void internerSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
