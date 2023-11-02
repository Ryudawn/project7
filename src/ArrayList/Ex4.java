package ArrayList;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1("둘리");
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("영어", 95 ));
		student1.subjectList.add(new Subject("과학", 70));
		student1.subjectList.add(new Subject("사회", 85));
		student1.showInfo();
		
		Student1 student2 = new Student1("둘리");
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("영어", 85 ));
		student2.subjectList.add(new Subject("과학", 70));
		student2.subjectList.add(new Subject("사회", 85));
		student2.showInfo();
		
		

	}

}
class Subject {
	String name;
	int score;
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
}
class Student1 {
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student1(String studentName) {
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	public void showInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total +=  s.score;
		}
		System.out.println(studentName + "학생의 총점은" + total + "입니다");
	}
}
