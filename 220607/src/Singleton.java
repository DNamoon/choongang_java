
public class Singleton {
	private static Singleton ss = new Singleton();
	
	private Singleton() {}
	
	static Singleton ddd() {
		return ss;
		
	}

}
