package finalTeamProject0;

import finalTeamProject0.*;


public class RockGameHang extends RockGame{

//��ӹ޾Ƽ� �ʵ� ���� ��ġ�� �θ�Ŭ������ �޼ҵ带 ����߽��ϴ�
	@Override
	public int rockGame() {
		this.win = 7;
		this.tie = 5;
		this.lose = 3;
		return super.rockGame();
	
	}
	
}
