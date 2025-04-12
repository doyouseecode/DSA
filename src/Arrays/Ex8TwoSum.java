package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Ex8TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSumHashMap2(array, 9)));
    }

    public static int[] twoSumArray(int[] nums, int target) {
        // TODO
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    // Here in the map we put  the number itself
    // and we check the complement, we call the get method
    // and say do we have in the array a number that I need
    public static int[] twoSumHashMap1(int[] nums, int target) {
        // TODO
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] { i, map.get(complement)};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
    }


    // Here in the map we put the number needed
    // and then look in the map, is there another element
    // where the current number needed
    // like is there a number that needs me
    public static int[] twoSumHashMap2(int[] nums, int target) {
        // TODO
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[] { i, map.get(nums[i])};
            }
            else{
                map.put(target - nums[i], i);
            }
        }
        return null;
    }




}
