package codes;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class FibonacciSequence {
    private static HashMap<BigInteger, Integer> map;
    private static BigInteger current;
    private static Scanner sc = new Scanner(System.in);
    
    public static HashMap<BigInteger, Integer> generateFibs() {
        HashMap<BigInteger, Integer> map = new HashMap<BigInteger, Integer>();
        BigInteger current = new BigInteger("1");
        BigInteger previous = new BigInteger("0");
        BigInteger otherPrevious;
        map.put(current, 0);
        map.put(previous, 1);
        for (int i = 2; i < 1000; i++) {
            otherPrevious = previous;
            previous = current;
            current = previous.add(otherPrevious);
            map.put(current, i);
        }
        return map;
    }
    
    public static void main(String[] args) {
        map = generateFibs();
        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            current = new BigInteger(sc.nextLine());
            System.out.print("" + map.get(current) + " ");
        }
    }
}