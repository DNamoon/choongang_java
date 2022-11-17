package finalTeamProject0;

import finalTeamProject0.*;


public class RockGameHang extends RockGame{

//상속받아서 필드 값만 고치고 부모클래스의 메소드를 사용했습니다
	@Override
	public int rockGame() {
		this.win = 7;
		this.tie = 5;
		this.lose = 3;
		return super.rockGame();
	
	}
	
}
