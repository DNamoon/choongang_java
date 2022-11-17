
public class CarExam {
	public static void main(String[] args) {
//		Car cc = new Car();  // 객체 생성 (object가 메모리에 올라간거래)  
//		//클래스를 데이터 타입으로 정함. Car클래스가 변수 myCar의 데이터 타입.
//		System.out.println(cc); //메모리 상의 객체 주소.
//		System.out.println(cc.aaa);//필드값이 나온다.
//		cc.printAAA();
//		cc.aaa = "다라마";
//		cc.printAAA();
//		
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시","검정",200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}
}
