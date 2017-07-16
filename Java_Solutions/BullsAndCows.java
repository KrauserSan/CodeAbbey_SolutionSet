package codes;


import java.util.Scanner;

public class BullsAndCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String secret = sc.next();
		int range = sc.nextInt();
		sc.nextLine();
		String[] guesses = new String[range];
		for(int i=0; i<range; i++){
			guesses[i] = sc.next();
		}
		
		for(String s: guesses){
			char[] sec = secret.toCharArray();
			char[] guess = s.toCharArray();
			int first = 0;
			int second = 0;
			for(int j = 0; j<sec.length;j++){
				if(sec[j]==guess[j]){
					first+=1;
					sec[j]='-';
					guess[j]='-';
				}
			}
			for(int i =0; i<guess.length;i++){
				for(int j =0; j<sec.length; j++){
					if(sec[j]!='-'&&guess[i]==sec[j]){
						second+=1;
						sec[j]='-';
						guess[i]='-';
						break;
					}
				}
				
			}
			
			System.out.print(first + "-"+ second + " ");
			
		}
	}

}
