// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Multiplication table of " + n + " is : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
