package factory;

public class Divide implements Calculator {

	@Override
	public void execute(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println((double) x/y);
	}
	

}
