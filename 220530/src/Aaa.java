
public class Aaa {
	int ii;
	String ss;
	boolean bb;
	
	Aaa(){
	}
	
	Aaa(int ii) {
		//this.ii = ii;
		this(ii, null);  //this() - �ٸ� ������ ȣ��
		//ii = ii;
	}
	
	Aaa(int ii, String ss){ //������ �����ε�
		this.ii = ii;
		this.ss = ss;
	}
	
	String getSS() {
		return this.ss;
	}
	
	void print() {
		System.out.println(this.ii);
		System.out.println(this.ss);
		System.out.println(this.bb);
	}
	
	void setSs(String ss) {
		this.ss = ss;
	}
	
	static void svsv() { //static�� �پ������� �����޼ҵ�. ��ü ���� �� �ص� ����� �� �ִ�.
		System.out.println("���� �޼ҵ�"); 
		
	}
	
	public static void main(String[] args) {
		Aaa aa = new Aaa();
		Aaa aa2 = new Aaa(300);
		Aaa aa3 = new Aaa(300,"Good");
		//aa.ii= 3;
		System.out.println(aa.ii);
		System.out.println(aa.ss);
		System.out.println(aa.bb);
		System.out.println();
		
		aa.ii = 100;
		aa.ss = "�ȳ�";
		aa.bb = true;
		
		System.out.println(aa.ii);
		System.out.println(aa.ss);
		System.out.println(aa.bb);
		System.out.println();
		
		System.out.println(aa2.ii);
		aa.setSs("Test");
		System.out.println();
		
		aa.print();
		aa.svsv();
		Aaa.svsv();
	}

}
