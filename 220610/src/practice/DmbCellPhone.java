package practice;

public class DmbCellPhone extends CellPhone {
	//��� p.290
	//�ʵ� 
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;  //��� ���� �ʵ� model
		this.color = color;  //��� ���� �ʵ� color
		this.channel = channel; // DmbCellPhone Ŭ������ �ʵ�
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ��� �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb ��� ������ ����ϴ�.");
	}

}
