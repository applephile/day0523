package day0523;

public class PointMain {

	public static void main(String[] args) {
		
		Point[] p = new Point[5];
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Point();
			
			p[i].x = i + 1;
			p[i].y = i * 2;
			
			System.out.print(p[i].x + ", ");
			System.out.println(p[i].y);
		}
		
	}

}
