/*
Arrays is a collection of data of same datatype.

Index starts from 0 and ends length-1
*/
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int[] arrayLiteral = new int[]{1, 2, 3, 4}; // array literal
        int[] array = new int[5]; // Array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 Numbers : ");
        // Getting 5 numbers separately and storing in array
        for(int i = 0; i < 5; i++){
            array[i] = input.nextInt();
        }
        // Printing data in array
        System.out.println("Array Literal : ");
        for (int i= 0; i < 4; i++) {
            System.out.println(arrayLiteral[i]);
        }
        System.out.println("Array : ");
        for (int i= 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
