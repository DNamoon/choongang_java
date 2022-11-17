package pg378;

public interface MyInterface {
	public void mthod1();
	//public void method2();  // 나중에 추가할 때 이런식으로 하면 문제 생긴다.
	public default void method2(){  //default 를 하면 자연스럽게 새로 생성할 수 있다.
		System.out.println("MyInterface-method2 실행");
	}
}
