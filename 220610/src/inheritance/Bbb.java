package inheritance;

public class Bbb extends Aaa{
	
	String name;
	
	Bbb(String nn, int jj) {
		super(nn,jj);
	}
	
	Bbb(String nn, int jj, String name) {
		super(nn,jj);
		this.name = name;
	}
/*	
	public void ppp() {
		System.out.println("자식의 ppp");
	}*/
	
	public void ppp() {
		this.qqq();
		System.out.println("자식의 ppp()");
		super.qqq();
	}

}
