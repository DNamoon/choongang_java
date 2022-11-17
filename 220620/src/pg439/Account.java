package pg439;

public class Account {
	private long balance;
	
	public Account() {}
	
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficient{
		if(balance<money) {
			throw new BalanceInsufficient("잔고부족:"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}
