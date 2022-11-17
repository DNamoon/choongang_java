package pg666;

//나 지금 제네릭 메서드만 이해한거 같아.
public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int cap) {
		this.name = name;
		//students = new T[cap];  //이걸 하고 싶은데 이걸 못 한대.
		students = (T[]) new Object[cap];  //그래서 상위클래스 Object로 객체 생성하고 강제타입변환
	}
	
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	

}
