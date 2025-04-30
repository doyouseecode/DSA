package Arrays;

public class Ex13RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(matrix);
    }

    // {{1,2,3},
    //  {4,5,6},
    //  {7,8,9}}
    public static void rotateMatrix(int[][] matrix) {
        if(matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++){
            int first = layer; // first = 0
            int last = n - 1 - layer; // last = 2
            for(int i = layer; i < last; i++){
                int offset = i - layer; // offset = 0
                int top = matrix[first][i]; // top = 1
                printMatrix(matrix);
                matrix[first][i] = matrix[last-offset][first]; // updated 1 with 7
                printMatrix(matrix);
                matrix[last-offset][first] = matrix[last][last-offset]; // updated 7 with 9
                printMatrix(matrix);
                matrix[last][last-offset] = matrix[i][last];
                printMatrix(matrix);
                matrix[i][last] = top;
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("------");
    }


}
