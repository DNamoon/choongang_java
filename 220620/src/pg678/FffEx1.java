package pg678;

public class FffEx1 {

	public static void main(String[] args) {
		Fff bb = (tt, x) -> {
			System.out.println("이게 람다식?");
			System.out.printf("%s = %s\n",tt, x);
		};
		bb.ccc("x",200);
		
//		Fff aa = new Fff() {
//			@Override
//			public void mmm() {
//				System.out.println("익명 구현 객체");
//			}
//		};
//		aa.mmm();
//		bb.mmm();
	}
}
