// Sum of first N natural numbers

import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        sc.close();

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is : " + sum);
    }
}
