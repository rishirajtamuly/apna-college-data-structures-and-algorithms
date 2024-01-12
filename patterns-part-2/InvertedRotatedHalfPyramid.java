/*
 Print

    *
   **
  ***
 **** 

*/

import java.util.*;

public class InvertedRotatedHalfPyramid {

    public static void printInvertedRotatedHalfPyramid(int totalRows) {

        /* 
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows; j++) {
                if(j <= totalRows - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        */

        for (int i = 1; i <= totalRows; i++) {
            // spaces
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : ");
        int totalRows = sc.nextInt();
        sc.close();
        printInvertedRotatedHalfPyramid(totalRows);
    }
}
