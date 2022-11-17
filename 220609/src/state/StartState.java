package state;

public class StartState implements State {

	@Override   //어노테이션
	public void doAction(Context con) {  //매개변수로 Context클래스의 객체를 받겠다는 의미?
		System.out.println("플레이어 시작 중");
		con.setSt(this); // 아직 객체 생성 안 했는데 설계도를 미리 만든 것.
	}
	
	public String toString() {
		return "시작 상태";
	}
	

}
