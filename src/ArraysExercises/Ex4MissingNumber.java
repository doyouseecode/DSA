package ArraysExercises;

public class Ex4MissingNumber {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));
    }

    static int findMissingNumberInArray(int[] arr) {
        int arraySum = 0, n = arr.length+1;
        for(int i = 0; i < arr.length; i++){
            arraySum+=arr[i];
        }
        int sumOfN = (n * (n+1))/2;
        return sumOfN - arraySum;
    }
}
