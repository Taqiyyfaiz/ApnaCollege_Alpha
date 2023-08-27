public class Assignments {
    
    //Bubble Sort
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    //Swap
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
    }

    //Selection Sort
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    //Insertion Sort
    public static void InsertionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            
            //Finding out the correct position to insert 
            while(prev >=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
    }

    //Counting Sort
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]] ++; 
        }
        //Sorting
        int j = 0;
        for(int i=count.length-1; i>=0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        printArr(arr);
    }
}
