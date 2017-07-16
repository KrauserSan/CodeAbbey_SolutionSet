package codes;

import java.util.Scanner;

public class FoolsDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i< range; i++){
			int result = 0;
			String[] line = sc.nextLine().split(" ");
			for(String s : line){
				result += Math.pow(Integer.parseInt(s),2);
			}
			System.out.print(result + " ");
		}

	}

}
