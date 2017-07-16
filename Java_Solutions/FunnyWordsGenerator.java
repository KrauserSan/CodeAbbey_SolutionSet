package codes;

import java.util.Scanner;

public class FunnyWordsGenerator {

	private long A = 445;
	private long C = 700001;
	private long M = 2097152;
	private long currSeed;
	
	
	public FunnyWordsGenerator(long seed) {
		// TODO Auto-generated constructor stub
		this.currSeed = seed;
	}
	
	public long[] randomArray(long seed,int n){
		long[] nums = new long[n];
		long xCurr = seed;
		long xNext;
		for(int i =0;i<n;i++){
			xNext = (A*xCurr + C)%M;
			nums[i] = xNext;
			xCurr = xNext;
		}
		currSeed = xCurr;
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String consonant = "bcdfghjklmnprstvwxz ";
		String vowel = "aeiou ";
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		long seed = sc.nextLong();
		int[] wordSize = new int[range];
		for (int i = 0; i<range; i++){
			wordSize[i] = sc.nextInt();
		}
		FunnyWordsGenerator obj = new FunnyWordsGenerator(seed);
		
		for(int i:wordSize){
			long[] nums = obj.randomArray(obj.currSeed,i);
			String word = "";
			for(int j =0; j<nums.length;j++){
				if((j+1)%2!=0){
					word = word + consonant.charAt((int)nums[j]%19);
				}else{
					word = word + vowel.charAt((int)nums[j]%5);
				}
			}
			System.out.print(word + " ");
		}

		
	}

}
