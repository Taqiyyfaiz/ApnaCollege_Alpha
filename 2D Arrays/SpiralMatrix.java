public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startcol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startcol <= endCol) {
            //top
            for(int j=startcol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //Right
            for(int i=startRow; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");                 
            }

            //bottom
            for(int j=endCol-1; j>=startcol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startcol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}, 
                            {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}
