/*
Print
A
BC
DEF
GHIJ
*/

import java.util.*;

public class CharacterPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numberOfLines = sc.nextInt();
        char ch = 'A';
        sc.close();

        for (int line = 1; line <= numberOfLines; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
