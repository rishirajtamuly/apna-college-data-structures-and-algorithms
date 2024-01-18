
public class TrappingRainwater {

    public static int trappedRainwater(int[] height) {
        int n = height.length;
        // calculate left max boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(height[j], rightMax[j + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int k = 0; k < n; k++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[k], rightMax[k]);
            // trapped water = waterLevel - height[i]
            trappedWater = trappedWater + (waterLevel - height[k]);
        }
        return trappedWater;        
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total rain water trapped = " + trappedRainwater(height)); 
    }
}
