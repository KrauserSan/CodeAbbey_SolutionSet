package codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWord {
	private long A = 445;
	private long C = 700001;
	private long M = 2097152;
	private long currSeed;
	
	
	public MostFrequentWord(long seed) {
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
		int range = 900000;
		long seed = sc.nextLong();
		MostFrequentWord obj = new MostFrequentWord(seed);
		ArrayList<String> wordList = new ArrayList<String>();
		for(int i=0;i<range;i++){
			long[] nums = obj.randomArray(obj.currSeed,6);
			String word = "";
			for(int j =0; j<nums.length;j++){
				if((j+1)%2!=0){
					word = word + consonant.charAt((int)nums[j]%19);
				}else{
					word = word + vowel.charAt((int)nums[j]%5);
				}
			}
			wordList.add(word);
		}
		
		HashMap<String,Integer> wordMap = new HashMap<String,Integer>();
		int max = 0;
		String maxWord = "";
		for(String s : wordList){
			if(wordMap.get(s)!=null){
				wordMap.put(s, wordMap.get(s)+1);
				if(wordMap.get(s)>max){
					max = wordMap.get(s);
					maxWord = s;
				}
			}else{
				wordMap.put(s, 1);
			}
		}

		System.out.println(maxWord);
		
	}
}