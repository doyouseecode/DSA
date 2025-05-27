package ArraysExercises;

import java.util.Arrays;

public class Ex5DuplicateNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        int uniques = 0;
        int[] result = new int[arr.length];
        boolean isDuplicate;
        for(int i = 0; i < arr.length; i++){
            isDuplicate = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[uniques++]= arr[i];
            }
        }
        return Arrays.copyOf(result, uniques);
    }
}
