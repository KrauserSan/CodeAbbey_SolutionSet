package codes;

import java.util.Scanner;

public class TreeHeightMeasurement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int i =0;i<range;i++){
			double d = sc.nextDouble();
			double b = sc.nextDouble();
			double a = b-90;
			double h = Math.tan(Math.toRadians(a))*d;
			System.out.print(Math.round(h) + " ");
		}

	}

}
