
public class Ccc extends Aaa {
	
	public Ccc(int i, String string) {
		super(i,string);
	}

	public static void main(String[] args) {
		Ccc cc = new Ccc(500, "CCC");
		cc.print();
		cc.setSs("������");
		cc.print();
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		//super.print();
		System.out.println("������ ����");
	}

}
