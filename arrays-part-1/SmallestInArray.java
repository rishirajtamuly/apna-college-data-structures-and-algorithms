// Find the smallest number in array.

import java.util.*;

public class SmallestInArray {
    
    public static int smallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;    // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];  

        System.out.println("Enter numbers in array : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("Smallest number in array = " + smallestNumber(numbers));
    }

}
