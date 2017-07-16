package codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KingAndQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 Map<Character,Integer> letter2Num = new HashMap<Character,Integer>();
		 letter2Num.put('a', 1);
		 letter2Num.put('b', 2);
		 letter2Num.put('c', 3);
		 letter2Num.put('d', 4);
		 letter2Num.put('e', 5);
		 letter2Num.put('f', 6);
		 letter2Num.put('g', 7);
		 letter2Num.put('h', 8);
		 
		 int range = sc.nextInt();
		 for (int i = 0; i < range; i++){
			 String kingPos = sc.next();
			 String queenPos = sc.next();
			 int kingX = letter2Num.get(kingPos.charAt(0));
			 int kingY = kingPos.charAt(1);
			 int queenX = letter2Num.get(queenPos.charAt(0));
			 int queenY = queenPos.charAt(1);
			 double slope = -2;
			 if(kingX != queenX){
				 slope = Math.abs((double)(kingY - queenY)/(kingX - queenX));
			 }
			 
			 if(kingX == queenX || kingY==queenY || slope==1){
				 System.out.print("Y" + " ");
			 }else{
				 System.out.print("N" + " ");
			 }
			 
		 }
	}

}
