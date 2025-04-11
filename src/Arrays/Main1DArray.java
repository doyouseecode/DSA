package Arrays;

public class Main1DArray {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

//        var firstElement = sda.arr[0];
//        System.out.println(firstElement);
//        var thirdElement = sda.arr[2];
//        System.out.println(thirdElement);

//        sda.searchInArray(40);
        sda.deleteElement(0);
        System.out.println(sda.arr[0]);
    }

}
