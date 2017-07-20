package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirlsAndPigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i=0;i<testCases;i++){
			int legs = sc.nextInt();
			int breasts = sc.nextInt();
			int comp = breasts-legs;
			List<Integer> pigs = new ArrayList<Integer>();
			int k = 2;
			while(k<=comp){
				if(comp%k==0){
					pigs.add(comp/k);
				}
				k= k+2;
			}
			int count = 0;
			for(int j:pigs){
				if((legs-4*j)>0 && (legs-4*j)%2==0){
					count = count + 1;
				}
			}
			System.out.print(count + " ");
		}
	}

}
