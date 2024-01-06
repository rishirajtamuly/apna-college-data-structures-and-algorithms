// Print numbers from 1 to n

import java.util.*;

public class Print1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int range = sc.nextInt();
        int counter = 1;
        sc.close();

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
