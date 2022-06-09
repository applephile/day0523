package day0523;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "탐슨";
		s.age = 33;
		s.addr = "샌프란시스코 오라클 아레나";
		
		s.studentInfo();
		
		Student s2 = new Student();
		
		s2.name = "커리";
		s2.age = 35;
		s2.addr = "샌프란시스코 오라클 아레나";
		
		s2.studentInfo();

		s = s2;
	}

}
