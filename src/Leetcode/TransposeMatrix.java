package Leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{2,4,-1}, {-10,5,11},{18,-7,6}};
        int[][] matrix = {{1,2,3}, {4,5,6}};
//        int[][] matrix = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15}
//        };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    // 2   4 -1 ->  2 -10 18 -> 2 -10 18
    // -10 5 11 ->  4   5 11 -> 4  5  -1
    // 18 -7  6 ->  -1 -7  6 -> 18

    // 1 2 3 -> 1 4
    // 4 5 6 -> 2 5
    //          3 6

//            1  2  3  4  ->  1 5 9
//            5  6  7  8  ->  2 6 10
//            9 10 11 12  ->  3 7 11
//                            4 8 12

    public static int[][] transpose(int[][] matrix){
            int[][] res = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                for(int j = 0; j < matrix.length;j++){
                    res[i][j] = matrix[j][i];
                }
            }
            return res;
    }
}
