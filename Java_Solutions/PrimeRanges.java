package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		
		int n = 3000000;
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++){
            prime[i] = true;
		}
		prime[0]=false;
		prime[1] = false;
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
		
		for (int i = 0; i<range; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
			for ( int j = a; j<=b;j++){
				if(prime[j]==true){
					count +=1;
				}
			}
			System.out.print(count + " ");
		}
		
	}

}
