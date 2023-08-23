import java.util.*;

public class BasicSorting {
    public static void bubbleSort(int arr[]) { //time & space complexity O(n Square)
        //outer loop is running n times
        for(int turn=0; turn<arr.length; turn++) {
            //inner loop runs n-1-turns times
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}