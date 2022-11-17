package Interf;

public interface TestInter {
	int i = 100;  //인터페이스 안에 들어가는건 무조건 접근제한자가 public이래. 생략해도. //값 저장 못 한대.
	public static final int AAA_BBB = 400;
//int y;
	default void aaa() {
		
	};
	boolean bbb(); //중괄호 쓰는거는 없대.
}
