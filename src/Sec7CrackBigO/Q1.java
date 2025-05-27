package Sec7CrackBigO;

public class Q1 {
    public static void main(String[] args) {

    }

    void sumProductOfArray(int[] array){
        int sum = 0, product = 1;
        for (int i : array) {
            sum+=i;
            product*=i;
        }
    }
}
