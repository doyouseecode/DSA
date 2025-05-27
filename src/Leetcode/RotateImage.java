package Leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9},{2,4,8},{3,6,7}};
        displayMatrix(matrix);
        System.out.println("--------");
        rotate(matrix);
        displayMatrix(matrix);
    }

        // 1 2 3         7 2 1        temp 1
        // 4 5 6         4 5 6
        // 7 8 9         9 8 3
    public static void rotate(int[][] matrix) {
        int l = 0; // l = 1
        int r = matrix.length - 1; // r = 1
        // i = 1
        while ( l < r ) {
            for(int i = 0; i < r - l; i++) {
                //save the topleft
                int topLeft = matrix[l][l + i];

                //move bottom left into top left
                matrix[l][l + i] = matrix[r - i][l];

                // move bottom right into bottom left
                matrix[r - i][l] = matrix[r][r - i];

                // move top right into bottom right
                matrix[r][r - i] = matrix[l + i][r];

                // move top left into top right
                matrix[l + i][r] = topLeft;
            }
            r--;
            l++;
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t"); // Use tab for better spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
