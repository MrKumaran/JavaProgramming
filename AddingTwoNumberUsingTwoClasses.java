class addTwoNumbers{
    // Declaring two integer numbers
    int x = 10;
    int y = 20;
    // Declaring function add to add two numbers stored in variables x,y
    void add(){
        System.out.println(x+y);
        System.out.println(x+"+"+y+"="+(x+y));
    }
}

public class AddingTwoNumberUsingTwoClasses {
    public static void main(String[] args) {
        // Creating object for class addTwoNumbers
        addTwoNumbers ATN = new addTwoNumbers();
        ATN.add();
    }
}
