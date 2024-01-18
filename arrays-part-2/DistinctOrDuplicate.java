/*

Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true

Constraints:
• 1 <= nums . lengtth <= 105
• -109 <= nums [ i ] <= 109

*/

import java.util.*;

public class DistinctOrDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        boolean status = containsDuplicate(nums);
        if (status) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Every elements in array are distinct");
        }
    }
}
