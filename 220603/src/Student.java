
public class Student {
	//�ʵ�
	String name;
	int kor;
	int math;
	int eng;
	
	//������
	Student(String name){
		this.name = name;
	}
	
	//������
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	String content() {
		return name+": "+kor+","+math+","+eng;
	}
	
	int sum() {
		return kor +math +eng;
	}
	
	float avg() {
		return (float) sum()/3;
	}

}
