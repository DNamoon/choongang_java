
public class Car {
	String aaa = "가나다"; //aaa는 멤버 변수(필드)
	//System.out.println(aaa);   //필드와 메소드로 구성되어 있다. 여기는 필드 부분이여서 메소드 오면 컴파일 에러.
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	Car(){ //이것도 메소드인데 클래스 이름이랑 같으면 생성자라고 한대. 생성자는 생성할 때만 한번 쓴대.또 못 부른대.(maybe)
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed =maxSpeed;
	}
	
	void printAAA() { //여기가 메소드 부분인가봐
		System.out.println(aaa);
	}
	
}
