package day0523;

public class Phone {

	String name;
	String spec;
	int cost;
	
	public void phoneSpec() {
		System.out.printf("%s는 %s로 %,d원입니다.\n", name, spec, cost);
	}
}
