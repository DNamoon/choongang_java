
public class Test01 {
	static String ss;
	
	static {ss= "Test";}
	
	Test01(String ss) {
		this.ss = ss;
	}
	
	public static void main(String[] args) {
		//Test01 ts = new Test01("테스트");
		//System.out.println(ts.ss);
		//Test01.ss = "테스트";
		System.out.println(Test01.ss);
	}

}
