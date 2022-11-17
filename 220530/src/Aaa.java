
public class Aaa {
	int ii;
	String ss;
	boolean bb;
	
	Aaa(){
	}
	
	Aaa(int ii) {
		//this.ii = ii;
		this(ii, null);  //this() - 다른 생성자 호출
		//ii = ii;
	}
	
	Aaa(int ii, String ss){ //생성자 오버로딩
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
	
	static void svsv() { //static이 붙어있으면 정적메소드. 객체 생성 안 해도 사용할 수 있다.
		System.out.println("정적 메소드"); 
		
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
		aa.ss = "안녕";
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
