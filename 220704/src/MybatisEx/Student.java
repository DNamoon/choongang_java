package MybatisEx;

public class Student {
	String name;
	int score;
	int dept_id;
	
	public Student(String name, int score, int dept_id) {
		this.name = name;
		this.score = score;
		this.dept_id = dept_id;
	}

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", dept_id=" + dept_id + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	
	
	
}
