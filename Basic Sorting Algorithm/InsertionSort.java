import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void insertionSort(Integer arr[]) {
        for(Integer i=0; i<arr.length; i++) {
            Integer curr = arr[i];
            Integer prev = i-1;
            //finding out the correct position to insert
            while(prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(Integer arr[]) {
        for(Integer i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        // to print in reverse order 
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}  