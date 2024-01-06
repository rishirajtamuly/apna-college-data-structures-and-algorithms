// Keep entering numbers till user enters a multiple of 10.

import java.util.*;

public class MultipleOf10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
        }
        sc.close();
    }
}
