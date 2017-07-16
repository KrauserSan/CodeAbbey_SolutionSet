package codes;

import java.util.Scanner;

public class BitCount {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for (int i = 0; i< range; i++){
			int input = sc.nextInt();
			int count = 0;
			String binaryIntInStr = Integer.toBinaryString(input);
			for (int y = 0; y<binaryIntInStr.length(); y++){
				if(binaryIntInStr.charAt(y) == '1'){
					count +=1;
				}
			}
			System.out.print(count + " ");
		}
	}

}
