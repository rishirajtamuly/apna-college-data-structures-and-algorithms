/*
Print
1
12
123
1234
*/

import java.util.*;

public class HalfPyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numberOfLines = sc.nextInt();
        sc.close();

        for (int line = 1; line <= numberOfLines; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
