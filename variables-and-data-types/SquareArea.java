/* In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side)) */

import java.util.*;

public class SquareArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        int side = sc.nextInt();
        sc.close();
        int area = side * side;
        System.out.println("Area of the square is : " + area);
    }
}
