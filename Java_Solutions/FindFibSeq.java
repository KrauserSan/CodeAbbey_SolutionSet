package codes;

import java.math.BigInteger;
import java.util.Scanner;


public class FindFibSeq 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        BigInteger[] nums = new BigInteger[t];
        for(int i = 0; i < t; i++ )
        {
            nums[i] = new BigInteger(in.next());
        }
        
        int[] ans = returnIndex(nums);
        System.out.println();
        
        for(int i: ans)
            System.out.print(i +" ");
        
    }
    
    public static int[] returnIndex(BigInteger[] nums)
    {
        BigInteger largest = nums[0];
        
        int[] ans = new int[nums.length];
        
        for(BigInteger i: nums)
        {
            if(i.compareTo(largest) > 0)
                largest = i;
        }
        
        
        int count = 2;
        BigInteger a  = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        
        
        while(b.compareTo(largest) < 0)
        {
            BigInteger temp = new BigInteger(a+"");
            a = new BigInteger(b+"");
            b = b.add(temp);
            
            for(int i=0; i < nums.length;i++)
            {
                if(b.equals(nums[i]))
                    ans[i] = count;
            }
            
            count++;
        }
        
        return ans;
        
        
    }
}