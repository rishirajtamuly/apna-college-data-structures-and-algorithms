// Print prime numbers in a range.

import java.util.*;

public class PrimeNumbersInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        System.out.println("Prime numbers in the range are : ");
        for (int k = 2; k <= n; k++) {
            if (isPrime(k)) {
                System.out.print(k + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int num = sc.nextInt();
        sc.close();
        primesInRange(num);
    }
}
