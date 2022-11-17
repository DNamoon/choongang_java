package pg666;

//�� ���� ���׸� �޼��常 �����Ѱ� ����.
public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int cap) {
		this.name = name;
		//students = new T[cap];  //�̰� �ϰ� ������ �̰� �� �Ѵ�.
		students = (T[]) new Object[cap];  //�׷��� ����Ŭ���� Object�� ��ü �����ϰ� ����Ÿ�Ժ�ȯ
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
