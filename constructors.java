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
    defaultConstructor(){
        System.out.println("This is Default constructor\nIt is primarily used for getting inputs from user");
        System.out.println("It doesn't take arguments");
    }
}


class parameterizedConstructor{
    parameterizedConstructor(String word){
        System.out.println("Parameterized constructor takes one or more number of arguments");
        System.out.println("In this example it takes " + word + "as parameter");
    }
}


public class constructors {
    public static void main(String[] args) {
        defaultConstructor DC = new defaultConstructor();
        System.out.println();
        parameterizedConstructor PC = new parameterizedConstructor("This word");
    }
}
