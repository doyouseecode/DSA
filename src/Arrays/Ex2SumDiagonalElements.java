package Arrays;

public class Ex2SumDiagonalElements {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
    }
    public static int sumDiagonalElements(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][i];
        }
        return sum;
    }
}
