package Test;

public class MyFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction f ;
		
		MyFunction f1 = new MyFunction() {
			@Override
			public void method(int x) {
				System.out.println("익명구현객체 생성 방법");
			}
		};
		f1.method(1);
		
		
		f = (x) -> { System.out.println("람다식 방법 1");};
		f.method(2);
		
		f = x -> System.out.println("람다식 방법 2, 매개변수 1개여서 괄호 생략, 실행문 한개여서 중괄호 생략");
		f.method(3);
	}

}
