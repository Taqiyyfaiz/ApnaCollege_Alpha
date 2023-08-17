package DSA.ARRAYS;

public class TrappingRainWater {
    public static int trappedRainWater(int height[]) { //time complexity O(n)
        int n = height.length;

        //calculate left max boundary - array (Auxilary arrays)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //claculate right max boundary - array (Auxilary arrays)
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedwater =0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightmax[i]);

            //trapped water = waterLevel - height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
