package codes;

import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();
		String[] s = sc.nextLine().split(" ");
		for(String c:s){
			if(c.equals("mul")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val1*val2);
			}else if(c.equals("div")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val2/val1);
			}else if(c.equals("sub")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val2-val1);
			}else if(c.equals("add")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val1+val2);
			}else if(c.equals("sqrt")){
				double val1 = stack.pop();
				stack.push(Math.sqrt(val1));
			}else if(c.equals("mod")){
				double val1 = stack.pop();
				double val2 = stack.pop();
				stack.push(val2%val1);
			}else{
				stack.push(Double.parseDouble(c));
			}
		}
		System.out.println((int)Math.round(stack.pop()));
	}
}
