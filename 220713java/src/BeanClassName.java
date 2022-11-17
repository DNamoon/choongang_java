import java.io.Serializable;

public class BeanClassName implements Serializable{
	private String value;
	
	public BeanClassName() {
		
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
