/*
Some Datatypes in JAVA
int
float
char
double
short
long
byte
boolean
 */
public class dataTypesInJAVA {
    public static void main(String[] args) {
        int Integer = 1; // Numbers including negative numbers
        char Character = 'H'; // Character stores single Alphabetic character
        float MediumDecimal = 2.13F; // Float datatype stores decimal values and Suffix "F" or "f" should be added at end to define float value
        double LargeDecimal = 3.312312341; // double stores large decimal value if Suffix "F" or "f" is not added it will automatically consider as double and throws error
        boolean IsStatement = true; // takes value true or false
        byte smallInteger = 127; // byte datatype can store numbers from -127 to 127
        System.out.printf("Integer %d\n", Integer);
        System.out.printf("Character %c\n", Character);
        System.out.printf("Float %f\n", MediumDecimal);
        System.out.printf("Double %f\n", LargeDecimal);
        System.out.printf("Boolean "+ IsStatement+"\n");
        System.out.printf("Byte %d", smallInteger);
    }

}
