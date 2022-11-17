
public class Singleton {
	//정적 필드
	private static Singleton singleton = new Singleton();
	
	//생성자 
	private Singleton(){
		
	}
	//정적 메서드
	static Singleton getInstance() {
		return singleton;
	}
}
