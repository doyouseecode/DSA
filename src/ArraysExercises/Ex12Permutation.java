package ArraysExercises;

public class Ex12Permutation {
    public boolean permutation(int[] array1, int[] array2){
        // TODO
        int sum1 = 0, mult1 = 1;
        int sum2 = 0, mult2 = 1;

        for(int i: array1){
            sum1+=i;
            mult1*=i;
        }
        for(int i: array2){
            sum2+=i;
            mult2*=i;
        }

        return sum1==sum2 && mult1 == mult2;
    }
}
