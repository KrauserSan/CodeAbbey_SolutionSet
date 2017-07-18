package codes;

import java.util.Scanner;

public class CloudAltitudeMeasurement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<range;i++){
			double d1 = sc.nextDouble();
			double a = Math.tan(Math.toRadians(sc.nextDouble()));
			double b = Math.tan(Math.toRadians(sc.nextDouble()));
			double h = b*a*d1/(b-a); 
			System.out.print(Math.round(h)+ " ");
		}

	}

}
