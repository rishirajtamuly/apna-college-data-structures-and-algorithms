// Write a Java method to compute the average of three numbers..

import java.util.*;

public class Average {

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        System.out.println("Average is : " + average(a, b, c));
    }
}
