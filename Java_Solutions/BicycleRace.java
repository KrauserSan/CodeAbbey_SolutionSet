package codes;

import java.util.Scanner;

public class BicycleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < range; i++){
			int distance = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			double time = distance/(double)(a+b);
			double result = time*a;
			System.out.print(result + " ");
			
			sc.nextLine();
		}
		
	}

}
