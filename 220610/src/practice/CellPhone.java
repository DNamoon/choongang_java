package practice;

public class CellPhone {
	//상속 p.290
	
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드 
	void powrOn() { System.out.println("전원을 켭니다.");}
	void poweroff() { System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("본인: " + message);}
	void receiveVoice(String message) { System.out.println("상대방: " + message);}
	void hangUp() { System.out.println("전화를 끊습니다.");}
	

}
