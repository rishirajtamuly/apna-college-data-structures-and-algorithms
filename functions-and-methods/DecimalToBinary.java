// Convert decimal number to binary.

import java.util.*;

public class DecimalToBinary {

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();
        sc.close();
        decToBin(num);
    }
}
