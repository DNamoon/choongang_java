package vending1;

public class VendingMachine {
	public enum State {NOCOIN, SELECTABLE, SOLDOUT}
	public enum Products {COLA, COFFEE, CIDEER}
	
	private State state = State.NOCOIN; // 열거 변수 = 열거타입.열거상수
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
			System.out.println("동전을 넣으세요.");
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
		System.out.println("코인 증가! 코인" + (++this.coin) + "개");
	}
	
	public void decreaseCoin(int coin) {
		System.out.println("코인 감소! 코인 " + (--this.coin) + "개");
	}
	
	public void provideProduct(Products productId) {
		System.out.println(productId + "가 나왔습니다.");
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
		System.out.println("제품 모두 소진! 동정을 반환합니다.");
	}
	
}






















































