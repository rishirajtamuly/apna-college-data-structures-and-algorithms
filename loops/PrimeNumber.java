// Check if a given number is prime or not.

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        if (n == 2) {
            System.out.println(n + " is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {   // n is multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not a prime");
            }
        }
    }
}
