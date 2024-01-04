/* In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.*;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        float average = (float) (A + B + C) / 3;
        System.out.println("Average of " + A + ", " + B + " and " + C + " is : " + average);
    }
}
