/*
Print
    * * * *
    * * *
    * *
    *
 */

import java.util.*;

public class InvertedStarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numberOfLines = sc.nextInt();
        sc.close();

        for (int line = 1; line <= numberOfLines; line++) {
            for (int star = 1; star <= numberOfLines - line + 1; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
