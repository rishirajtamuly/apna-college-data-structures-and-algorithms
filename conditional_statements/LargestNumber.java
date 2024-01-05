// Print the largest of two numbers.

import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
      
        if (A >= B) {
            System.out.println(A + " is largest of two");
        } else {
            System.out.println(B + " is largest of two");
        }
    }
}
