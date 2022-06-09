package day0523;

public class MainPhone {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.name = "삼성 갤럭시 z플립";
		p.spec = "접는 휴대폰";
		p.cost = 1500000;
		
		p.phoneSpec();
		
		System.out.println(p.name + "은 " + p.spec + "으로 " + p.cost + "원입니다.");
		
		
		Phone p1 = new Phone();
		
		p1.name = "아이폰13 Pro";
		p1.spec = "Applephile";
		p1.cost = 1400000;

		p1.phoneSpec();
		
		System.out.println(p1.name + "은 " + p1.spec + "으로 " + p1.cost + "원입니다.");
	}

}
