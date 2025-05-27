package Sec7CrackBigO;

public class Q5 {
    public static void main(String[] args) {

    }

    static void printUnorderedPairs (int[] arrayA, int[] arrayB){
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for(int k = 0; k < 1000000; k++){
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
}
