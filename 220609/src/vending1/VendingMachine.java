package vending1;

public class VendingMachine {
	public enum State {NOCOIN, SELECTABLE, SOLDOUT}
	public enum Products {COLA, COFFEE, CIDEER}
	
	private State state = State.NOCOIN; // ���� ���� = ����Ÿ��.���Ż��
	private int coin;
	
	public int getCoin() {
		return coin;
	}
	
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	public void insertCoin() {
		switch(state) {
		case NOCOIN:
			increaseCoin(coin);
			state = State.SELECTABLE;
			break;
		case SELECTABLE:
			increaseCoin(coin);
			break;
		default:
		}
	}
	
	public void select(Products productId) {
		switch(state) {
		case NOCOIN:
			System.out.println("������ ��������.");
			break;
		case SELECTABLE:
			provideProduct(productId);
			decreaseCoin(coin);
			if(hasNoCoin()) {
				state = State.NOCOIN;
			}
		case SOLDOUT:
			break;
		default:
		}
		
	}
	
	public void increaseCoin(int coin) {
		System.out.println("���� ����! ����" + (++this.coin) + "��");
	}
	
	public void decreaseCoin(int coin) {
		System.out.println("���� ����! ���� " + (--this.coin) + "��");
	}
	
	public void provideProduct(Products productId) {
		System.out.println(productId + "�� ���Խ��ϴ�.");
	}
	
	public boolean hasNoCoin() {
		if(coin >0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void setSoldout() {
		state = State.SOLDOUT;
	}
	
	public void returnCoin() {
		this.coin = 0;
		System.out.println("��ǰ ��� ����! ������ ��ȯ�մϴ�.");
	}
	
}






















































