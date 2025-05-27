package Sec7CrackBigO;

public class Q4 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        printUnorderedPairs(array1, array2);
    }

    static void printUnorderedPairs(int[] arrayA, int[] arrayB){
        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB.length; j++){
                System.out.println(arrayA[i] + ", " +arrayB[j]);
            }
        }
    }
}
