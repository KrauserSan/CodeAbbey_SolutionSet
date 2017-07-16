package codes;

import java.util.Scanner;

public class CombinationsCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int i = 0; i<range; i++){
			int N,K;
			N = sc.nextInt();
			K = sc.nextInt();
			if(N==K){
				System.out.print(1 + " ");
			}else{
				if(K>=N/2){
					long num = 1;
					for(int n = N; n>K;n=n-1){
						num = num*n;
					}
					
					long den = 1;
					for(int j=N-K;j>1;j=j-1){
						den = den*j;
					}
					
					System.out.print((num/den) + " ");

				}else{
					long num = 1;
					for(int n =N; n>N-K;n=n-1){
						num = num*n;
					}
					long den = 1;
					for(int j = 1; j<=K; j++){
						den = den*j;
					}
					System.out.print((num/den) + " ");
				}
				
			}
		}
	}

}
