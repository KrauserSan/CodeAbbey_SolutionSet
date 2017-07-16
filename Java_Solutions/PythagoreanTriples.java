package codes;

import java.util.Scanner;

public class PythagoreanTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		long[] values = new long[range];
		for(int i = 0; i< range; i++){
			values[i] = sc.nextInt();
			sc.nextLine();
		}
		for (long s : values){
			long a, b, c;
			//Using Euler's method to calculate the triplets
		    int sqrt = (int)Math.sqrt(s);
		    for (long n = 1; n <= sqrt; n++) {
		        for (long m = n+1; m <= sqrt; m++) {
		            a = m*m - n*n;
		            b = 2*m*n;
		            c = m*m + n*n;
		            if ( a + b + c == s ) {
		                System.out.print(c*c + " ");
		                break;
		            }
		        }
		    }
		}

	}

}
