package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RotationIn2DSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> yMap = new HashMap<Integer,String>();
		HashMap<String,Integer> xMap = new HashMap<String,Integer>();
		int range = sc.nextInt();
		int[] xArr = new int[range];
		int[] yArr = new int[range];
		int rotAngle = sc.nextInt();
		sc.nextLine();
		for (int i =0;i<range;i++){
			String name = sc.next();
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double len = Math.sqrt(x*x + y*y);
			double angle = rotAngle + Math.toDegrees(Math.atan2(y, x));
			x = (int)Math.round(Math.cos(Math.toRadians(angle))*len);
			y = (int)Math.round(Math.sin(Math.toRadians(angle))*len);
			xArr[i] = (int) x;
			yArr[i] = (int) y;
			xMap.put(name, xArr[i]);
			if(yMap.get(yArr[i])!=null){
				yMap.put(yArr[i], yMap.get(yArr[i]) + " " + name);
			}else{
				yMap.put(yArr[i], name);
			}
			sc.nextLine();
		}
		Arrays.sort(yArr);
		ArrayList<Integer> mySet = new ArrayList<Integer>();
		for(int i:yArr){
			if(mySet.contains(i)){
				continue;
			}else{
				mySet.add(i);
			}
		}
		HashMap<Integer,String> xList = new HashMap<Integer,String>();
		for(Integer i: mySet){
			if(!yMap.get(i).contains(" ")){
				System.out.print(yMap.get(i) + " ");
			}else{
				String[] names = yMap.get(i).split(" ");
				int[] vals = new int[names.length];
				for(int j =0; j<names.length;j++){
					vals[j] = xMap.get(names[j]);
					xList.put(vals[j], names[j]);
				}
				Arrays.sort(vals);
				for(int k : vals){
					System.out.print(xList.get(k) + " ");
				}
			}
		}
	}
}
