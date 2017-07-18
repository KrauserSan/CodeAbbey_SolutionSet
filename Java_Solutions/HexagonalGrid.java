package codes;

import java.util.Scanner;

public class HexagonalGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i<range; i++){
			char[] chars = sc.nextLine().toCharArray();
			double x = 0;
			double y = 0;
			for(int j =0;j<chars.length;j++){
				if(chars[j]=='A'){
					x = x+1;
					continue;
				}
				if(chars[j] =='B'){
					x = x+ 0.5;
					y = y + Math.sqrt(3.0)/2;
					continue;
				}
				if(chars[j]=='C'){
					x = x - 0.5;
					y = y + Math.sqrt(3.0)/2;
					continue;
				}
				if(chars[j]=='D'){
					x = x-1;
					continue;
				}
				if(chars[j]=='E'){
					x = x-0.5;
					y = y-Math.sqrt(3.0)/2;
					continue;
				}
				if(chars[j]=='F'){
					x = x + 0.5;
					y = y - Math.sqrt(3.0)/2;
					continue;
				}
			}
			System.out.print(Math.sqrt((x*x + y*y)) + " ");
		}

	}

}
