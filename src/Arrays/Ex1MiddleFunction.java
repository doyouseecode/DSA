package Arrays;

public class Ex1MiddleFunction {
    public static int[] middle(int[] array) {
        if(array.length<1){
            return null;
        }
        int arr[] = new int[array.length-2];
        int j = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = array[j];
            j++;
        }
        return arr;
    }
}
