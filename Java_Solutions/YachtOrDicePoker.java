package codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YachtOrDicePoker {
	private String smallStraight = "12345";
	private String bigStraight = "23456";
	
	public boolean checkBigStraight(char[] testCase){
		Arrays.sort(testCase);
		char[] test = bigStraight.toCharArray();
		for(int i =0; i<test.length;i++){
			if(testCase[i]!=test[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkSmallStraight(char[] testCase){
		Arrays.sort(testCase);
		char[] test = smallStraight.toCharArray();
		for(int i =0; i<test.length;i++){
			if(testCase[i]!=test[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkfullHouse(char[] testCase) {
		// TODO Auto-generated method stub
		if(checkPair(testCase) && checkThree(testCase)){
			return true;
		}
		return false;
	}
	
	public boolean checkYacht(char[] testCase){
		for(int i=1; i<testCase.length;i++){
			if(testCase[i]!=(testCase[i-1])){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkFour(char[] testCase){
		String s = new String(testCase);
		int count1 = s.length() - s.replaceAll(s.substring(0, 1),"").length();
		int count2 = s.length() - s.replaceAll(s.substring(1,2), "").length();
		if(count1 == 4 || count2 == 4){
			return true;
		}
		return false;
	}
	
	public boolean checkThree(char[] testCase){
		String s = new String(testCase);
		int count1 = s.length() - s.replaceAll(s.substring(0, 1),"").length();
		int count2 = s.length() - s.replaceAll(s.substring(1,2), "").length();
		int count3 = s.length() - s.replaceAll(s.substring(2,3 ),"").length();
		if(count1 ==3 || count2==3 || count3 ==3){
			return true;
		}
		return false;
	}
	
	public boolean checkTwoPair(char[] testCase){
		Map<Character,Integer> counts = new HashMap<Character,Integer>();
		int tot = 0;
		for(char s : testCase){
			if(counts.containsKey(s)){
				counts.put(s, counts.get(s)+1);
			}else{
				counts.put(s, 1);
			}
		}
		for(char s: counts.keySet()){
			if(counts.get(s)==2){
				tot = tot + 2;
			}
			if(tot==4){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkPair(char[] testCase){
		Map<Character,Integer> counts = new HashMap<Character,Integer>();
		for(char s : testCase){
			if(counts.containsKey(s)){
				counts.put(s, counts.get(s)+1);
			}else{
				counts.put(s, 1);
			}
		}
		for(char s: counts.keySet()){
			if(counts.get(s)==2){
				return true;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		YachtOrDicePoker obj = new YachtOrDicePoker();
		for(int i = 0;i<range; i++){
			char[] testCase = sc.nextLine().replaceAll(" ", "").toCharArray();
			if(obj.checkBigStraight(testCase)){
				System.out.print("big-straight ");
				continue;
			}else if(obj.checkSmallStraight(testCase)){
				System.out.print("small-straight ");
				continue;
			}else if(obj.checkfullHouse(testCase)){
				System.out.print("full-house ");
				continue;
			}else if(obj.checkYacht(testCase)){
				System.out.print("yacht ");
				continue;
			}else if(obj.checkFour(testCase)){
				System.out.print("four ");
				continue;
			}else if(obj.checkThree(testCase)){
				System.out.print("three ");
				continue;
			}else if(obj.checkTwoPair(testCase)){
				System.out.print("two-pairs ");
				continue;
			}else if(obj.checkPair(testCase)){
				System.out.print("pair ");
				continue;
			}else{
				System.out.print("none ");
				continue;
			}
		}
	}
}
