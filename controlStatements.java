/*
Three category of Control statements
1. Branching -> if, if-else, if-elseif-else, nested if-else
2. Looping -> for, for each, while, do while
3. Jumping -> break, continue, return
*/
import java.util.Scanner;
class branching{
    // if-else statements evaluate based on some condition
    branching(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Entered Number is EVEN");
        }
        else {
            System.out.println("Entered Number is ODD");
        }
    }
}
class Looping{
    // loop statements execute block of code defined inside it until condition fails.
    Looping(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int limit = input.nextInt();
        int loopVariable = 0;
        System.out.println("While Loop");
        // While loop checks condition if true execute until condition fails also do while available.
        while(loopVariable <= limit){
            System.out.println(loopVariable);
            loopVariable++;
        }
        System.out.println("For loop");
        // for loop has syntax for(initialization;condition;increment/decrement){} it is used when we want to run some block of code for some known number of times
        for(loopVariable = 0; loopVariable <= limit; loopVariable++)
        {
            System.out.println(loopVariable);
        }
        System.out.println("For each");
        String[] stringArray = {"You"," are"," Unwanted"," burden."};
        // used to access all element in array in order without using index value
        for(String variable: stringArray){
            System.out.print(variable);
        }
    }
}
// Three main jump statements: break, continue, and return. Used primarily to break loops
public class controlStatements {
    public static void main(String[] args) {
        // Using constructors
        branching Branch = new branching();
        Looping Loop = new Looping();
    }
}
