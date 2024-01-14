// Program to search an element in an array using linear search.

import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];  // [2, 4, 6, 8, 10, 12, 14, 16]

        System.out.println("Enter numbers in array : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search in array : ");
        int key = sc.nextInt();
        int index = linearSearch(numbers, key);

        sc.close();

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " is at index : " + index);
        }
    }
}
