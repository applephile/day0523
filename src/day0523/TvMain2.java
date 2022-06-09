package day0523;

public class TvMain2 {

	public static void main(String[] args) {
		
//		int[] score = new int[5];
		
		Tv[] tvArr1 = new Tv[3];
		//이건 단순 참조변수를 선언을 했을 뿐이고,
		
		//아래와 같이 new Tv()를 이용하여 각각의 배열을 초기화 시켜줘야 한다
		//new를 통해서 인스턴스를 생성해줘야 한다

		//객체 배열 초기화 방법 1
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
		
		//객체 배열 초기화 방법 2
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		//객체 배열 초기화 방법 3
		Tv[] tvArr3 = new Tv[100];
		
		for(int i=0; i<tvArr3.length; i++) {
			tvArr3[i] = new Tv();
		}
	}

}
