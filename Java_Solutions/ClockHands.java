package codes;

import java.util.Scanner;

public class ClockHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<range;i++){
			String[] s = sc.next().split(":");
			int hr = Integer.parseInt(s[0]);
			int min = Integer.parseInt(s[1]);
			int beginX = 10;
			int beginY = 10;
			int hrLen = 6;
			int minLen = 9;
			
			if(hr >12){
				hr = hr-12;
			}
			double hrAngle = 30*hr +((double)1/2)*min;
			double minAngle = 6*min;
			
			double hrX = Math.sin(Math.toRadians(hrAngle))*hrLen + beginX;
			double hrY = Math.cos(Math.toRadians(hrAngle))*hrLen + beginY;
			double minX = Math.sin(Math.toRadians(minAngle))*minLen + beginX;
			double minY = Math.cos(Math.toRadians(minAngle))*minLen + beginY;
			System.out.print(hrX + " "+ hrY +" " +minX + " "+minY + " ");
		}
	}

}
