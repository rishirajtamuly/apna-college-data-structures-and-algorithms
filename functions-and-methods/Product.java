// Find the product of two numbers.

import java.util.*;

public class Product {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int prod = multiply(a, b);     // copy of a and b will be pass to multiply function
        System.out.println("Product of " + a + " and " + b + " is : " + prod);
    }
}
