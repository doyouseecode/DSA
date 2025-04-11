package Arrays;

import java.util.Arrays;

public class Main2DArray {

    // Space complexity O(m * n)
    // meaning 2 * 2 = 4 times we had initialization
    public static void main(String[] args) {
//        // Step 1 - Declare
//        int[][] int2DArray;
//        // Step 2 - Instantiate
//        // m = 2, n = 2
//        int2DArray = new int[2][2];
//        // Step 3 - Initialize
//        int2DArray[0][0] = 1;
//        int2DArray[0][1] = 2;
//        int2DArray[1][0] = 3;
//        int2DArray[1][1] = 4;
//        // For 2D and more Arrays we use
//        // Arrays.deepToString method
//        System.out.println(Arrays.deepToString(int2DArray));
//
//        String[][] s2DArray = {{"a","b"},{"c","d"}};
//        System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInTheArray(0,0,10);
        sda.insertValueInTheArray(0,1,20);
        sda.insertValueInTheArray(1,0,30);
        sda.insertValueInTheArray(1,1,40);
        sda.accessCell(0,1);

        sda.traverse2DArray();
        sda.searchingValue(20);
        sda.searchingValue(40);
        sda.deleteValueFromRay(1,1);
        sda.deleteValueFromRay(1,1);
        sda.traverse2DArray();
    }

}
