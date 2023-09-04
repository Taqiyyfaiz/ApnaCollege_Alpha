import java.util.*;

public class Matrices {
    public static boolean Search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at Cell ("+ i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found !");
        return false;
    }
    // public static void main(String args[]) {
    //     int matrix[][] = new int[3][3];
    //     int n = matrix.length, m = matrix[0].length;

    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }

    //     //output
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     Search(matrix, 5);
    // }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        //Primary
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        diagonalSum(matrix);
    }

}