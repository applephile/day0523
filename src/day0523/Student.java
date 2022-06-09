package day0523;

//public : 접근제한자, 해당 클래스에 접근할 수 있는 인원을 제한을 하는 것인데 public은 모든 인원에게 접근을 허락하는 것
public class Student {
	
	//1. 필드(속성) 선언
	
	String name;
	int age;
	String addr;
	
	//2. 메서드(기능) 선언
	//메서드의 첫 글자는 소문자
	public void studentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 주소 : " + addr);
	}
	
}


