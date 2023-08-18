public class Assignment1 {
    public static boolean arraynums(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]== nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Exampe 1:
        // int nums[] = {1, 2, 3, 1};
        // System.out.println(arraynums(nums));

        //Example 2:
        // int nums[] = {1, 2, 3, 4};
        // System.out.println(arraynums(nums));

        //Exmaple 3:
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(arraynums(nums));
    }
}
