package Bridge;

public class BrigeExam {
	public static void main(String[] args) {
		Shape rc = new Circle(100, 100, 10, new RedCircle());
		rc.draw();
		Shape gc = new Circle(50, 50, 5, new GreenCircle());
		gc.draw();

	}

}
