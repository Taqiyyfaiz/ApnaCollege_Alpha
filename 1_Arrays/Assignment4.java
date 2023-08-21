public class Assignment4 {
    //leetcode problem no:42
    public static int rainWaterTrapping(int height[]) {
        //initialzie n for hieghtr.length
        int n = height.length; 
        //initilize LeftMax
        int[] lMax = new int[n]; 
        //initialize RightMax
        int[] rMax = new int[n]; 
        int water = 0;

        for(int i=0; i<n; i++) {
            if(i == 0) {
                lMax[0] = height[0];
                rMax[n-1] = height[n-1];
            } else {
                //to find the Max Height fo Leftside
                lMax[i] = Math.max(height[i], lMax[i-1]); 
                //to find the Maximum height of Rightside
                rMax[n-i-1] = Math.max(height[n-i-1], rMax[n-i]); 
            }
        }
        for(int i=0; i<n; i++) {
            //Calculate water 
            water += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWaterTrapping(height));
    }
}