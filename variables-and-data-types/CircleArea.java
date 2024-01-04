// Calculate the area of a circle

import java.util.*;

public class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float rad = sc.nextFloat();
        sc.close();
        float area = 3.14F * rad * rad;
        System.out.println("Area of circle is : " + area);
    }
}
