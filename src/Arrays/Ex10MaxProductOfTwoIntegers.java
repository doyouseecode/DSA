package Arrays;

public class Ex10MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));
    }

    // Time complexity = O(n)
    public static String maxProduct(int[] intArray) {
        // TODO
        int fMax = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        for (int j : intArray) {
            if (fMax < j) {
                sMax = fMax;
                fMax = j;
            } else if (sMax < j) {
                sMax = j;
            }
        }

        return fMax + "," + sMax;
    }
}
