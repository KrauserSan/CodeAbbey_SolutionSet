package codes;

import java.util.Scanner;

public class FlyingTextScreensaver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		int len = sc.nextInt();
		
		int x = 0;
		int y = 0;
		boolean forward = true;
		boolean horizontal = true;
		int count = 0;
		System.out.print(x + " " + y + " ");
		while(count <100){
			
			if(x==0){
				horizontal = true;
			}else if(x + len == width){
				horizontal = false;
			}
			if(horizontal){
				x = x +1;
				System.out.print(x + " ");
			}else{
				x = x - 1;
				System.out.print(x + " ");
			}
			
			
			if(y==0){
				forward = true;
				
			}else if(y == height-1){
				forward = false;
			}
			if(!forward){
				y = y-1;
				System.out.print(y + " ");
			}else{
				y = y+1;
				System.out.print(y + " ");
			}
			count +=1;
			
			
		}
		
	}

}
