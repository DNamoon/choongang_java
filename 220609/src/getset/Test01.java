package getset;

public class Test01 {
	private int aa;
	private boolean bb;
	
	
	
	public int getAa() {
		return aa;
	}



	public void setAa(int aa) {  //���͸� �ָ鼭 �ڵ� ����
		if(aa<0) {
			this.aa = 100;
			return;
		}
		this.aa = aa;
	}



	public boolean isBb() {  //�Ҹ��� Ÿ���� is... ���·� ���Ͱ� �����ȴ�.
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
