// Calculate the product of two numbers

import java.util.*;

public class Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is : " + product);
    }
}
