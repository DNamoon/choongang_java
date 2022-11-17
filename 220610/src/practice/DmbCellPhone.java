package practice;

public class DmbCellPhone extends CellPhone {
	//상속 p.290
	//필드 
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;  //상속 받은 필드 model
		this.color = color;  //상속 받은 필드 color
		this.channel = channel; // DmbCellPhone 클래스의 필드
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송 수신합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춥니다.");
	}

}
