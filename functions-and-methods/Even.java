/*  Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write 
a program to test your method. */

import java.util.*;

public class Even {
    
    public static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isEven(num));        
    }
}
