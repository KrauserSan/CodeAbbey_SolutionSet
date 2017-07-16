package codes;

import java.util.Scanner;

public class SmoothingTheWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] input = new double[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < input.length; i++){
			input[i] = sc.nextDouble();
		}
		double[] ans = new double[input.length];
		ans[0] = input[0];
		ans[ans.length - 1] = input[input.length - 1];
		System.out.print(ans[0] + " ");
		for (int i = 1; i < input.length - 1; i++){
			ans[i] = (input[i] + input[i-1] + input[i+1])/3;
			System.out.print(ans[i] + " ");
		}
		System.out.print(ans[ans.length - 1]);

	}

}
