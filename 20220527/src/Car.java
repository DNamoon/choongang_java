
public class Car {
	String aaa = "������"; //aaa�� ��� ����(�ʵ�)
	//System.out.println(aaa);   //�ʵ�� �޼ҵ�� �����Ǿ� �ִ�. ����� �ʵ� �κ��̿��� �޼ҵ� ���� ������ ����.
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	
	Car(){ //�̰͵� �޼ҵ��ε� Ŭ���� �̸��̶� ������ �����ڶ�� �Ѵ�. �����ڴ� ������ ���� �ѹ� ����.�� �� �θ���.(maybe)
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed =maxSpeed;
	}
	
	void printAAA() { //���Ⱑ �޼ҵ� �κ��ΰ���
		System.out.println(aaa);
	}
	
}
