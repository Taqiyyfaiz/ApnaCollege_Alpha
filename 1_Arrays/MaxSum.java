package DSA.ARRAYS;

public class MaxSum {
    
    public static void MaxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //Nested Loop
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) { //PRINT
                    //subarray sum
                    currSum += numbers[k]; 
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubarraySum(numbers);
    }
}
