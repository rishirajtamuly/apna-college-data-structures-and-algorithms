// Swap two values

import java.util.*;

public class SwapValue {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Before swapping a = " + a + " and b = " + b);
        swap(a, b);
    }
}
