
public class Student {
	private String name;
	private int no;
	
	Student (){
	}
	
	Student(String name){ //»ý¼ºÀÚ
		this.name = name;
	}
	
	Student(String name, int no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}

}
