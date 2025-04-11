package Arrays;

public class TwoDimensionalArray {

    int[][] arr;

    public TwoDimensionalArray(int numberOfRows, int numberOfCol) {
        this.arr = new int[numberOfRows][numberOfCol];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Time Complexity O(1)
    // Space Complexity O(1)
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("The cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Time Complexity O(1)
    // Space Complexity O(1)
    public void accessCell(int row, int col) {
        try {
            System.out.println("The value in the cell is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Time Complexity O(m * n)
    // Space Complexity O(1)
    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Time Complexity O(m * n)
    // Space Complexity O(1)
    public void searchingValue(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("The value " + value + " is found at: (" + row + ", " + col+")");
                    return;
                }
            }
        }
        System.out.println("The value is not found in the array");
    }

    public void deleteValueFromRay(int row, int col) {
        try {
            if (arr[row][col] != Integer.MIN_VALUE) {
                arr[row][col] = Integer.MIN_VALUE;
                System.out.println("The value is successfully deleted");
            } else {
                System.out.println("The cell is already empty");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

}
