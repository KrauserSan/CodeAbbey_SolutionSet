package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int lim = sc.nextInt();
		sc.nextLine();
		while (count < lim){
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			List<Integer> inp = new ArrayList<Integer>();
			inp.add(a);
			inp.add(b);
			inp.add(c);
			Collections.sort(inp);
			if (Math.pow(inp.get(0), 2) + Math.pow(inp.get(1),2) > Math.pow(inp.get(2),2)){
				System.out.print("A" + " ");
			}else if (Math.pow(inp.get(0), 2) + Math.pow(inp.get(1),2) < Math.pow(inp.get(2),2)){
				System.out.print("O" + " ");
			}else{
				System.out.print("R" + " ");
			}
			count +=1;
		}

	}

}
