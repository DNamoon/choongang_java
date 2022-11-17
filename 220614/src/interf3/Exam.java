package interf3;

public class Exam {
	public static void main(String[] args) {
		Aaa aa = new Bbb();
		aa.run();
		
		Bbb bb = (Bbb) aa;
		//bb.ccc();
		
		//((BBb)aa).ccc();
	}
}
