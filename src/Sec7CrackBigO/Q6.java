package Sec7CrackBigO;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,7,8};
        reverse(array);
    }

    static void reverseArray(int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    static void reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int rightElements = array.length-i-1;
            int leftElements = array[i];
            array[i] = array[rightElements];
            array[rightElements] = leftElements;
        }
        System.out.println(Arrays.toString(array));
    }
}
