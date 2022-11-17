package pg439;

public class TryWithEx {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
