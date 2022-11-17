
public class StaticMe {
	int i;
	int t;
	String z;
	
	StaticMe(int i){
		this.i = i;
		System.out.println("int i ");
	}
	
	StaticMe(int i,int t){
		this(i);
		this.t = t;
		System.out.println("int i int t");
	}
	
	StaticMe(int i, int t, String z){
		this(i, t);
		this.z = z;
		System.out.println("int z");
	}
	
	static void method(int i) {
		System.out.println("정적 메서드 활용");
	}
	
	public static void main(String[] args) {
		StaticMe m = new StaticMe(10,20, "qwe");
	}
}
