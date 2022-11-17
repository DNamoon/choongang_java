package NullObj;

public class RealCustomer extends Customer {
	
	public RealCustomer(String[] name) {
/*		this.name = name;*/
	}
	
	@Override
	public boolean isNil() {
		
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
