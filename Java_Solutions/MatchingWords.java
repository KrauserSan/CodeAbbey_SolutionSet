package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MatchingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> ans = new ArrayList<String>();
		Map<String,Integer> inp = new HashMap<String,Integer>();
		int i = 0;
		String item = sc.next();
		while(!item.equals("end")){
			if (inp.get(item) != null && !ans.contains(item)){
				ans.add(item);
			}else{
				inp.put(item,i);
				i++;
			}
			item = sc.next();
		}
		Collections.sort(ans);
		//System.out.println(ans.toString().replaceAll("(, |\\[|\\])", " "));
		System.out.println(ans.toString().replaceAll("[^a-z]+"," "));

	}

}
