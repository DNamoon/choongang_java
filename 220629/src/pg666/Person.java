package pg666;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	
	//�ʵ尡 private�̿��� �ٸ� Ŭ�������� ���� �Ұ�! �׷��� getter/setter �̿�
	
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
