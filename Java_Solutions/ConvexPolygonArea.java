package codes;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvexPolygonArea {
	
	public double area(Integer[] base,Integer[] integers,Integer[] integers2){
		int x1 = base[0];
		int y1 = base[1];
		int x2 = integers[0];
		int y2 = integers[1];
		int x3 = integers2[0];
		int y3 = integers2[1];
		
		double a =  Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double b =  Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
		double c =  Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		area = Math.round(area*10);
		
		return area/10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer[]> inp = new ArrayList<Integer[]>();
		
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i<range;i++){
			Integer[] tempArr = {sc.nextInt(),sc.nextInt()};
			inp.add(tempArr);
		}
		double totalArea = 0;
		ConvexPolygonArea obj = new ConvexPolygonArea();
		Integer[] base = inp.get(0);
		for(int i=1;i<inp.size()-1;i++){
			totalArea = totalArea + obj.area(base,inp.get(i),inp.get(i+1));
		}
		System.out.println(totalArea);

	}

}
