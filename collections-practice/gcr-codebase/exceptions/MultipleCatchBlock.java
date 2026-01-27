import java.io.*;

public class MultipleCatchBlock {

    // method to access array element
    public static void arrayOperation(int[] array, int index) {

        // printing value at given index
        System.out.println("value at index: " + index + " is " + array[index]);
    }

    public static void main(String[] args) {
        try {
            // initializing array
            int[] array = {1, 2, 3, 4, 5, 6};

            // calling method with invalid index
            arrayOperation(array, 3);
        } 
        // handling array index out of bounds exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        } 
        // handling null pointer exception
        catch (NullPointerException e) {
            System.out.println("array is not initialized");
        }
    }
}
