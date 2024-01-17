
public class MaxSubarraySumKadanesAlgorithm {

    public static void maxSum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE; 
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            if (maxSum < currSum) {
                maxSum = currSum;
            }

        //    maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5};
        maxSum(numbers);
    }
}
