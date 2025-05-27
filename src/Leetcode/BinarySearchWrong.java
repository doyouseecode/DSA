package Leetcode;

public class BinarySearchWrong {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(array, 4));
    }

    public static int binarySearch(int[] array, int target){
        int l = 0, h = array.length-1;
        while(l<=h){
            int mid = (l + h ) / 2;
            System.out.print("Checking this: ");
            System.out.println(array[mid] + " == " + target);
            System.out.println("l = " + l + "; h = " + h) ;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                h = mid - 1 ;
            }
            else if(array[mid] < target){
                l = mid + 1;
            }
        }

        return -1;
    }

}
