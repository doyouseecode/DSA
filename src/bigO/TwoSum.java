package bigO;

import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1,5,7,9,3};
        int sum = 4;
        boolean b = betterSolution(array, sum);
        System.out.println(b);
    }

    public static boolean naiveSolution(int[] array, int sum){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean betterSolution(int[] array, int sum){
        HashSet<Integer> set = new HashSet<>();
        for(Integer i: array){
            if(set.contains(i)){
                return true;
            }
            set.add(sum-i);
        }
        return false;
    }
}
