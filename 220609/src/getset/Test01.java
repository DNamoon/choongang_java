package getset;

public class Test01 {
	private int aa;
	private boolean bb;
	
	
	
	public int getAa() {
		return aa;
	}



	public void setAa(int aa) {  //세터를 주면서 코드 검증
		if(aa<0) {
			this.aa = 100;
			return;
		}
		this.aa = aa;
	}



	public boolean isBb() {  //불리언 타입은 is... 형태로 세터가 생성된대.
		return bb;
	}



	public void setBb(boolean bb) {
		this.bb = bb;
	}



	public static void main(String[] args) {
		
		Test01 tt = new Test01();
		tt.aa =90;
	}
	
	

}
