package day0523;

public class BoxTest {

	public static void main(String[] args) {
		
		Box b = new Box();
		
		b.row = 20;
		b.col = 20;
		b.height = 30;
		
		b.boxPrint();
	
		System.out.printf("상자의 가로, 세로, 높이값은 %d, %d, %d입니다.", b.row, b.col, b.height);

	}

}
