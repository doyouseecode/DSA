package Arrays;

public class Ex12Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,5};
        int[] array2 = {5,1,2};
        System.out.println(permutation(array1, array2));
    }

    // O(n)
    public static boolean permutation(int[] array1, int[] array2){
        int counter = 0;
        boolean permutation = true;
        if(array1.length != array2.length){
            return false;
        }

        for (int j : array1) {
            for (int k : array2) {
                if (j == k) {
                    counter++;
                }
            }
            if (counter != 1) {
                permutation = false;
            }
            counter = 0;
        }

        return permutation;
    }
}
