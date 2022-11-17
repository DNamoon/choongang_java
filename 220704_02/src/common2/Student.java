package common2;

public class Student {
	private String name;
	private int score;
	
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString(){
		return "[" + name + "]" + ": " + score;
	}
	
	public void setString(String name) {
		this.name = name;
	}
	
	public String getString() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
