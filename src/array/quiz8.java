package array;

public class quiz8 {

	public static void main(String[] args) {

		Student[] info = new Student[3];
		
		info[0] = new Student("1","조점례");
		info[1] = new Student("2","조훈태");
		info[2] = new Student("3","박수철");
		
		for(int i = 0; i < info.length; i++) {
		info[i].showInfo();
		}
		
		
	}

}

class Student {
	String num,name;

	public Student(String num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(num + " " + name );
	}
	
}
