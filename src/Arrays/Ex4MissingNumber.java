package Arrays;

public class Ex4MissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[]{1, 2, 3, 4, 6}));
    }

    // Time Complexity -> O(n)
    static int findMissingNumberInArray(int[] arr) {
        int arraySum = 0;
        for (int j : arr) {
            arraySum += j;
        }
        int n = arr.length+1;
        int sumN = (n * (n+1)) / 2;
        return sumN - arraySum;
    }
}
