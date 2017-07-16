package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30000;
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
        
        Scanner sc= new Scanner(System.in); 
        int range = sc.nextInt();
        ArrayList<String> ansList = new ArrayList<String>();
        for(int i = 0; i<range; i++){
        	long test = sc.nextLong();
        	int curr = 0;
        	while (test!=1){
        		if(test%primes.get(curr)==0){
        			test = test/primes.get(curr);
        			ansList.add(Integer.toString(primes.get(curr)));
        		}else{
        			curr +=1;
        		}
        	}
        	System.out.print(String.join("*", ansList));
        	ansList.clear();
        	System.out.print(" ");

        }
	}
	

}
