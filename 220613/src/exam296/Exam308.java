package exam296;

public class Exam308 {
	public static void main(String[] args) {
		Bbb bb = new Bbb();
		Aaa aa = bb;
		
		Aaa aa2 = new Bbb();
		
		aa.mm1();
		aa.mm2();
		bb.mm2();
		aa2.mm2();
		//aa.mm3();
		//Aaa aa2 = new Bbb();
		//Bbb bb2 = (Bbb) new Aaa();
		//System.out.println(aa == bb);
	}
}
