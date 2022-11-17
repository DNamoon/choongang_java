package Interf2;

public interface Aaa {
	int MIN = 100;
	int MAX = 5000;
	void aaa();
	default void ddd(String ss) {
		System.out.println("이것은 "+ ss+ "입니다.");
	}

}
