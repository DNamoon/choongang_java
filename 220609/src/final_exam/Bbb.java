package final_exam;

public class Bbb extends Aaa {
	
	Bbb(String ddd){
		super(ddd);  //부모의 생성자를 실현하는 
	}
	
	public static void main(String[] args) {
		Bbb bb = new Bbb("가나다");
		bb.nnn = "홍길동";
		System.out.println(bb.ccc);
		
	}
}
