package codes;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] vals = new int[range];
		for (int i = 0; i<range; i++){
			vals[i] = sc.nextInt();
		}
		
		for(int i = 1; i<range; i++){
			int lim = range-i+1;
			int max = vals[0];
			int ind = 0;
			for(int j = 0;j<lim;j++){
				if(vals[j]>max){
					max = vals[j];
					ind = j;
				}
			}
			int temp = vals[ind];
			vals[ind] = vals[lim-1];
			vals[lim-1] = temp;
			System.out.print(ind + " ");
		}
	}

}
