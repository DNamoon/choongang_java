package pg439;

public class BalanceInsufficient extends Exception {
	public BalanceInsufficient() {}
	public BalanceInsufficient(String message) {
		super(message);
	}
}
