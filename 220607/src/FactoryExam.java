
public class FactoryExam {
	public static void main(String[] args) {
		Shape sh1= new Circle();
		Shape sh2 = new Rectangle();
		//Circle sh3 = new Rectanle();  //¾È µÈ´Ù. ¤¿
		
		sh1.draw();
		sh2.draw();
	}

}
