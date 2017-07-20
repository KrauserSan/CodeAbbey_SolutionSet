package codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VariableLengthCode {
	
	public String referChart(char c){
		Map<Character,String> referMap = new HashMap<Character,String>();
		referMap.put(' ', "11");referMap.put('t', "1001");
		referMap.put('n', "10000");referMap.put('s', "0101");
		referMap.put('r', "01000");referMap.put('d', "00101");
		referMap.put('!', "001000");referMap.put('c', "000101");
		referMap.put('m', "000011");referMap.put('g',"0000100");
		referMap.put('b', "0000010" );referMap.put('v', "00000001");
		referMap.put('k', "0000000001" );referMap.put('q',"000000000001");
		referMap.put('e', "101" );referMap.put('o', "10001");
		referMap.put('a', "011" );referMap.put('i', "01001");
		referMap.put('h', "0011");referMap.put('l',"001001");
		referMap.put('u', "00011");referMap.put('f', "000100");
		referMap.put('p', "0000101");referMap.put('w', "0000011");
		referMap.put('y', "0000001");referMap.put('j', "000000001");
		referMap.put('x', "00000000001");referMap.put('z', "000000000000");
		
		return(referMap.get(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] inp = sc.nextLine().toCharArray();
		String bits = "";
		VariableLengthCode obj = new VariableLengthCode();
		for(char c : inp){
			bits = bits + obj.referChart(c);
		}
		if(bits.length()%8!=0){
			int len = bits.length();
			int add = (int)Math.ceil(len/8.0)*8 - len;
			String addString = new String(new char[add]).replace("\0", "0");
			bits = bits + addString;
		}
		int begin = 0;
		String ans = "";
		for(int i=0;i<bits.length();i++){
			if((i+1)%8==0){
				int decimal = Integer.parseInt(bits.substring(begin, i+1),2);
				String res = Integer.toHexString(decimal); 
				ans = ans + res + " ";
				begin = i+1;
			}
		}
		char[] ansToChar = ans.toCharArray();
		for(int i =0; i<ansToChar.length;i++){
			if(Character.isLetter(ansToChar[i])){
				ansToChar[i] = Character.toUpperCase(ansToChar[i]);
			}
		}
		System.out.println(new String(ansToChar));
	}

}
