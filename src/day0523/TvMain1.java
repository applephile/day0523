package day0523;

public class TvMain1 {

	public static void main(String[] args) {

		Tv t = new Tv();
		
		t.channel = 7;
		t.volume = 10;
		
		System.out.println("Tv 채널 : " + t.channel + " Tv 볼륭 : " + t.volume);
		
		t.channelDown();
		
		System.out.println("Tv 채널 : " + t.channel + " Tv 볼륭 : " + t.volume);
		
		Tv t1 = new Tv();
		
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t1.channel + ", t2의 volume : " + t2.volume);
		
		t1.channel = 7;
		t1.volume = 20;
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t1.channel + ", t2의 volume : " + t2.volume);
		
		t2 = t1;
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t1.channel + ", t2의 volume : " + t2.volume);
		
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		t4 = t3;
		
		t3.channel = 9;
		
		System.out.println("t3의 channel : " + t3.channel);
		System.out.println("t4의 channel : " + t4.channel);
	}

}
