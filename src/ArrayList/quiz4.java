package ArrayList;

import java.util.ArrayList;

public class quiz4 {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(2000,"둘리"));
		student.add(new Student(2001,"도우너"));
		student.add(new Student(2002,"또치"));
		
		for(int i = 0; i < student.size(); i++) {
			Student s = student.get(i);
			
			s.showInfo();
		}
				
	}

}
class Student {
	int num ;
	String name;
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학번 :" + num + " 이름 : " + name);
	}
	
}