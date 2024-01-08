// Calculate sum of two numbers

import java.util.*;

public class Sum {

    public static int calculateSum(int num1, int num2) {    // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        sc.close();
        int sum = calculateSum(a, b);    // arguments or actual parameters
        System.out.println("Sum is : " + sum);
    }
}
