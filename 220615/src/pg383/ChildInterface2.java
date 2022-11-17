package pg383;

public interface ChildInterface2 extends ParentInterface {

	@Override
	default void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void method2() {
		// TODO Auto-generated method stub
		ParentInterface.super.method2();
	}
	
	
}
