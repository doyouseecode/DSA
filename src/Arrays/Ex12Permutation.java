package Arrays;

public class Ex12Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,5};
        int[] array2 = {5,1,3};
        System.out.println(permutationFast(array1, array2));
    }

    // O(n^2)
    public static boolean permutationSlow(int[] array1, int[] array2){
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

    // O (n)
    public static boolean permutationFast(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        int sum1 = 0, sum2 = 0, mult1 = 1, mult2 = 1;

        for(int i = 0; i < array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            mult1*=array1[i];
            mult2*=array2[i];
        }

        return sum1 == sum2 && mult1 == mult2;
    }
}
