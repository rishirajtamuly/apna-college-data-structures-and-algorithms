// Find the largest number in array.

import java.util.*;

public class LargestInArray {

    public static int largestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;    // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
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
        System.out.println("Largest number in array = " + largestNumber(numbers));
    }
}
