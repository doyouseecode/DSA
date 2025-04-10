package sec6Arrays;

public class MyArray {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.add(5);
        myArray.add(4);
        myArray.add(3);
        myArray.add(312);
        myArray.add(33);

        myArray.delete(3);

        myArray.printArray();

    }

    private int[] data;
    private int size;

    public MyArray(int capacity){
        this.size = 0;
        this.data = new int[capacity];
    }

    public int get(int index){
        return data[index];
    }

    public int add(int e){
        this.data[size] = e;
        size++;
        return size;
    }

    // This method I created just out of curiosity
    // In the ArrayList it is implemented other way
    // it doesn't exist in real Java
    public void delete(int index){
        int[] array = new int[this.data.length-1];

        for(int i = 0; i < index; i++){
            array[i] = this.data[i];
        }

        int pointer = index+1;
        for(int i = index; i < array.length; i++){
            array[i] = this.data[pointer];
            pointer++;
        }

        this.data = array;
        this.size--;
    }

    public void printArray(){
        for (int i : this.data) {
            System.out.println(i);
        }
    }




}
