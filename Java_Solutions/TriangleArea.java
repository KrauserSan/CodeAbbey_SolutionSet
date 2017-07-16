package codes;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		
		for (int i =0 ; i<range; i++){
			int x1,y1,x2,y2,x3,y3;
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			double a =  Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			double b =  Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
			double c =  Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
			
			double s = (a+b+c)/2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			area = Math.round(area*10);
			System.out.print(area/10 + " ");
			
			sc.nextLine();
		}
	}

}
