/*
 Print hollow rectangular pattern

 * * * * *
 *       *
 *       *
 * * * * *
 
 */

import java.util.*;

public class HollowRectangle {

    public static void printHollowRectangle(int totalRows, int totalCols) {
        // rows
        for (int i = 1; i <= totalRows; i++) {
            // inner columns
            for (int j = 1; j <= totalCols; j++) {
                // cells - (i, j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    // boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : ");
        int totalRows = sc.nextInt();
        System.out.print("Enter total number of columns : ");
        int totalCols = sc.nextInt();
        sc.close();
        printHollowRectangle(totalRows, totalCols);
    }
}
