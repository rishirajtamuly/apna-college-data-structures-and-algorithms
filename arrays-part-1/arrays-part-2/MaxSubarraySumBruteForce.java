
public class MaxSubarraySumBruteForce {

    public static void maxSum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        maxSum(numbers);
    }
}
