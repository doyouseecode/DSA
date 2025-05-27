package Leetcode;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 2, 2)));
    }

    // 2,3
//    {{1,2},{3,4},{5,6}} -> {{1,2,3},{4,5,6}}

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        int rows = 0, cols = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                res[rows][cols] = ints[j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}
