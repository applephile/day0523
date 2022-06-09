package day0523;

public class 진법변환 {

	public static void main(String[] args) {
		
		//10진수를 2진수로 변환하는 코드
		
		int decimal = 180;
		int binary[] = new int[8];
		
		System.out.printf("10진수 : %d\n", decimal);

		int arrNum = 0;
		
		while(true) {
			binary[arrNum] = decimal % 2;
			
			decimal /= 2;
			
			arrNum++;
			
			if(decimal == 0) {
				break;
			}
		}

		System.out.print("2진수 : ");
		for(int i=binary.length-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}

}
