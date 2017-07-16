package codes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciDivisibility {

	
	
	public List<BigInteger> fibGenerator(){
		List<BigInteger> vals = new ArrayList<BigInteger>();
		BigInteger current = new BigInteger("1");
		BigInteger previous = new BigInteger("0");
		vals.add(previous);
		vals.add(current);
		BigInteger next;
		for(int i = 0; i<=10000;i++){
			next = current.add(previous);
			vals.add(next);
			previous = current;
			current = next;
		}
		return vals;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciDivisibility obj = new FibonacciDivisibility();
		List<BigInteger> fibValues = obj.fibGenerator();
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<range; i++){
			BigInteger val = new BigInteger(sc.next());
			for(int j = 0; j<fibValues.size();j++){
				int res = fibValues.get(j).compareTo(val);
				if(res == -1){
					continue;
				}else{
					if(fibValues.get(j).mod(val).equals(new BigInteger("0"))){
						System.out.print(j + " ");
						break;
					}
				}
			}
		}
		
	}

}
