/*
Print

12345
1234
123
12
1

*/

import java.util.*;

public class InvertedHalfPyramidNumbers {

    public static void printInvertedHalfPyramidNumbers(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : ");
        int totalRows = sc.nextInt();
        sc.close();
        printInvertedHalfPyramidNumbers(totalRows);
    }
}
