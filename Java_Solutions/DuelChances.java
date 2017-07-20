package codes;

import java.util.Scanner;

public class DuelChances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int range = sc.nextInt();
		for(int i = 0; i<range;i++){
			float pa = sc.nextFloat()/100;
			float pb = sc.nextFloat()/100;
			float ans = Math.round((pa/(1-(1-pa)*(1-pb)))*100);

			System.out.print((int)ans + " ");
		}

	}

}
