/*
String is rather a class in java than a datatype
String in java is Immutable
(Note : String in other Programming languages also immutable)
*/
class stringCompare{

    void compareStrings(){
        String stringOne = "Hello!";
        String stringTwo = "hello!";
        System.out.println("Comparing using Equal(==) ");
        // Using == to compare
        System.out.println(stringOne == stringTwo);
        System.out.println();
        System.out.println("Comparing using Equal to method ");
        // Using .equal method to compare
        System.out.println(stringOne.equals(stringTwo));
        System.out.println();
        System.out.println("Comparing using Equal Ignore case method ");
        // It compares two string without comparing it case only content
        System.out.println(stringOne.equalsIgnoreCase(stringTwo));
    }
}

class stringManipulation {
    stringManipulation(){
        String word = "This is Example string";
        System.out.println("String Manipulation ");
        System.out.println("Original String : " + word);
        System.out.println("to upper case : " + word.toUpperCase());
        System.out.println("to lower case : " + word.toLowerCase());
        System.out.println("replacing s with S : " + word.replace("s", "S"));
    }
}
public class stringInJAVA {
    public static void main(String[] args) {
        String stringliteral = "This is String Literal"; // this stores data in string pool
        String stringNEW = new String("This is String using New keyword"); // this stores data in heap memory
        System.out.println(stringliteral);
        System.out.println(stringNEW);
        System.out.println();
        stringCompare SC = new stringCompare();
        SC.compareStrings();
        System.out.println();
        stringManipulation SM = new stringManipulation();
    }
}
