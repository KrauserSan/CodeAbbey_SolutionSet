package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IntroducingRegexps {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while((str=br.readLine())!=null){
			str = str.replaceAll("^0[0-7]+$", "oct");
			str = str.replaceAll("^0[Xx][0-9A-Fa-f]+$|^[0-9][0-9A-F]*[Hh]$", "hex");
			str = str.replaceAll("^0[Bb][0-1]+$|^[0-1][0-1]+[Bb]$", "bin");
			str = str.replaceAll("^[1-9][0-9]*", "dec");
			System.out.print(str + " ");
		}
		
	}

}