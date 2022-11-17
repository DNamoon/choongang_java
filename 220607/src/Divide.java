
public class Divide implements Calculator{
	int x ;
	int y ;
	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double executeD() {
		// TODO Auto-generated method stub
		if(y == 0) {
			return 0; //
		}
		return(double) x/y;
	} 

}
