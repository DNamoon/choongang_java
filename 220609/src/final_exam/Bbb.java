package final_exam;

public class Bbb extends Aaa {
	
	Bbb(String ddd){
		super(ddd);  //�θ��� �����ڸ� �����ϴ� 
	}
	
	public static void main(String[] args) {
		Bbb bb = new Bbb("������");
		bb.nnn = "ȫ�浿";
		System.out.println(bb.ccc);
		
	}
}
