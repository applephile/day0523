package day0523;

public class Variables {

	public static void main(String[] args) {
		
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "visa";
		c1.number = 1234;
		
		Card c2 = new Card();
		c2.kind = "master";
		c2.number = 7890;
		
		System.out.println("c1의 종류 : " + c1.kind + ", c1의 번호 : " + c1.number + ", c1의 너비 : " + c1.width + ", c1.높이 : " + c1.height);
		System.out.println("c2의 종류 : " + c2.kind + ", c2의 번호 : " + c2.number + ", c2의 너비 : " + c2.width + ", c1.높이 : " + c2.height);
		
		System.out.println("c1의 width와 height를 50, 80으로 변경");
		
		Card.width = 50; //클래스 변수는 클래스 이름을 사용하여 변수의 값을 바꿔주는 것이 일반적
		Card.height = 80;

		System.out.println("c1의 종류 : " + c1.kind + ", c1의 번호 : " + c1.number + ", c1의 너비 : " + c1.width + ", c1.높이 : " + c1.height);
		System.out.println("c2의 종류 : " + c2.kind + ", c2의 번호 : " + c2.number + ", c2의 너비 : " + c2.width + ", c1.높이 : " + c2.height);
		//c1의 width와 height를 고쳤지만 c2 역시 c1과 같은 클래스 주소를 참조하기 때문에 c2의 width와 height도 바뀌게 된다
		
		
	}

}
