package practice;

public class CellPhone {
	//��� p.290
	
	//�ʵ�
	String model;
	String color;
	
	//������
	
	//�޼ҵ� 
	void powrOn() { System.out.println("������ �մϴ�.");}
	void poweroff() { System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("����: " + message);}
	void receiveVoice(String message) { System.out.println("����: " + message);}
	void hangUp() { System.out.println("��ȭ�� �����ϴ�.");}
	

}
