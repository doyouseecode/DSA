package Sec4Arrays;

import java.util.Scanner;

public class ArrayProject {
    // Time Complexity O(3n) -> O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperatures? : ");
        int daysOf = scanner.nextInt();
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(daysOf);

        // O(n)
        for(int i = 0; i < singleDimensionArray.arr.length; i++){
            System.out.print("Enter temperature for day("+(i+1) + "): ");
            singleDimensionArray.arr[i] = scanner.nextInt();
        }
        int sum = 0, dAAverage = 0;

        // O(n)
        for (int i : singleDimensionArray.arr) {
            sum+=i;
        }
        double average = (double)sum / singleDimensionArray.arr.length;


        System.out.printf("Average temperature: %.5f \n", average);

        // O(n)
        for (int i : singleDimensionArray.arr) {
            if(i > average){
                dAAverage++;
            }
        }
        System.out.println("Days above the average: " + dAAverage);
    }
}
