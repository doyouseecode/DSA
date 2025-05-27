package ArraysExercises;

import java.util.Arrays;

public class Ex6RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int number = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != number){
                nums[index++] = nums[i];
                number = nums[i];
            }
        }
        return index;
    }

}
