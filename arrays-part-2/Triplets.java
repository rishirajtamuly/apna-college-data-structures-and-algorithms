/* 
Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.


Example 1:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [ [-1, -1, 2] , [-1, 0, 1] ]

Example 2:
Input: nums = [ ]
Output: [ ]

Example 3:
Input: nums = [ 0 ]
Output: [ ]

Constraints:
• 0 <= nums . length <= 3000
• -105 <= nums [ i ] <= 105
*/

import java.util.*;

public class Triplets {
    
    public static void printTriplets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((i != j && i != k && j != k) && (nums[i] + nums[j] + nums[k] == 0) ) {
                        System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
                    }
                }
            }
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " values in array");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();
        printTriplets(nums);
    }
}
