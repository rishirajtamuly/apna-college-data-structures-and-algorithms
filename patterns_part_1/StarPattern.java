/*  
Print    
    *       
    * *    
    * * *   
    * * * *
*/

import java.util.*;

public class StarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int numberOfLine = sc.nextInt();
        sc.close();

        for (int line = 1; line <= numberOfLine; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
