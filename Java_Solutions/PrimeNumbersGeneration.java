package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		int[] values = new int[range];
		for(int i = 0; i< range; i++){
			values[i] = sc.nextInt();
		}
		int n = 3000000;
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++){
            prime[i] = true;
		}
         
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                primes.add(i);
        }
        
        for(int i: values){
        	System.out.print(primes.get(i-1)+ " ");
        }
    }
		

}
