package ArraysExercises;

import java.util.Arrays;

public class Ex3BestScore {
    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
    }

    public static int[] findTopTwoScores(int[] array){
        // TODO
        int first = array[0];
        int second = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > first){
                second = first;
                first = array[i];
            }
        }
        return new int[]{first, second};
    }
}
