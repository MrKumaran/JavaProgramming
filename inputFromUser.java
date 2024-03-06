import java.util.*;
public class inputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Object for class SCANNER
        System.out.print("Enter Integer : ");
        int Number = input.nextInt(); // Gets Integer as input
        System.out.print("Enter Byte : ");
        byte Byte = input.nextByte(); // Gets Byte as input
        System.out.print("Enter Double : ");
        double Double = input.nextDouble(); // Gets Double as input
        System.out.print("Enter Float : ");
        float Float = input.nextFloat(); // Gets Float as input
        System.out.print("Enter Bool : ");
        boolean Bool = input.nextBoolean(); // Gets Bool as input
        System.out.print("Enter a String : ");
        String Word = input.next(); // Gets String as input
        System.out.println("Entered Number is " + Number);
        System.out.println("Entered Byte is" + Byte);
        System.out.println("Entered Double is " + Double);
        System.out.println("Entered Float is " + Float);
        System.out.println("Entered Bool is " + Bool);
        System.out.println("Entered String is " + Word);
    }
}
