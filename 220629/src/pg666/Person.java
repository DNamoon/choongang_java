package pg666;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	
	//필드가 private이여서 다른 클래스에서 접근 불가! 그래서 getter/setter 이용
	
//	public String toString() {
//		return name;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
