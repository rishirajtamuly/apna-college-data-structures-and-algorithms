/*  Write a Java program to get a number from the user and print whether it is
positive or negative.   */

import java.util.*;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        if (n > 0) {
            System.out.println(n + " is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is neither positive nor negative");
        }
    }
}
