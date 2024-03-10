/*
Constructors are the function with same name as class name
It is called as soon as class is instantiated

Constructors rules:
-> Constructors name should be same as class name for which that constructor represents.
-> Constructors should not have explicit return type.
-> Constructors should not be abstract, static, final, synchronized.

Two types of constructors
-> Default constructors
-> Parameterized constructors
*/
class defaultConstructor{
    // Default constructor has no parameter. even if no constructor is written in code java create its own constructor
    defaultConstructor(){
        System.out.println("This is Default constructor\nIt is primarily used for getting inputs from user");
        System.out.println("It doesn't take arguments");
    }
}


class parameterizedConstructor{
    // if one or more no of parameter is defined in constructor then it is called parameterized constructor
    parameterizedConstructor(String word){
        System.out.println("Parameterized constructor takes one or more number of arguments");
        System.out.println("In this example it takes " + word + "as parameter");
    }
}


class constructorOverloading{
    // Constructor overloading is the concept of having multiple constructor
    // but of different number of parameter or different datatype of parameter in constructor
    constructorOverloading(){
        System.out.println("When Object without passing argument is instantiated. This will print");
    }
    constructorOverloading(int noOfParameter){
        System.out.println("If "+ noOfParameter + " argument is passed this will print");
    }
    constructorOverloading(int one, int two){
        System.out.println("If two argument is passed then this will print");
    }
}
public class constructors {
    public static void main(String[] args) {
        defaultConstructor DC = new defaultConstructor();
        System.out.println();
        parameterizedConstructor PC = new parameterizedConstructor("This word");
        System.out.println();
        constructorOverloading CO_0 = new constructorOverloading();
        System.out.println();
        constructorOverloading CO_1 = new constructorOverloading(1);
        System.out.println();
        constructorOverloading CO_2 = new constructorOverloading(2, 4);
    }
}
