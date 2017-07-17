package codes;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int range = sc.nextInt();
		int[] elems = new int[range];
		for(int i =0; i<range; i++){
			elems[i] = sc.nextInt();
		}
		
		for(int i = 1; i<elems.length; i++){
			int currInd = i;
			int count = 0;
			while(currInd > 0 && elems[currInd]<elems[currInd-1]){
				int temp = elems[currInd];
				elems[currInd] = elems[currInd -1];
				elems[currInd - 1] = temp;
				count +=1;
				currInd -=1;
			}
			
			System.out.print(count + " ");
		}
		
		
	}

}
