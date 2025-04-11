package Arrays;

import java.util.Arrays;

public class Ex3BestScore {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopTwoScores(new int[]{})));
    }


    // Big O = O(n)
    public static int[] findTopTwoScores(int[] array){
        if(array.length==1){
            return new int[] {array[0],array[0]};
        }
        int[] result = {};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second || j <= first) {
                second = j;
            }
        }

        return new int[] {first, second};
    }

}
