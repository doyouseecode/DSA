package Sec7CrackBigO;

public class Q3 {
    public static void main(String[] args) {
        printPairs(new int[]{1,3,4,5});
    }

    static void printPairs(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.print(arr[i] +"" + arr[j] + " ");
            }
            System.out.println();
        }
    }
}
