package ArraysExercises;

import java.util.Arrays;

public class Ex1MiddleFunction {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(middle(myArray)));
    }

    public static int[] middle(int[] array){
        if(array == null || array.length < 1){
            return  array;
        }

        int[] result = new int[array.length-2];
        int i = 1, j = 0;
        while(j < result.length){
            result[j] = array[i];
            i++;
            j++;
        }

        return result;
    }
}
