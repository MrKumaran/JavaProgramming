public class Operators {

     void arithmeticOperators(){
        int numberOne = 40;
        int numberTwo = 10;
        System.out.println("\nArithmetic Operator");
        System.out.println("40 + 10 : " + (numberTwo + numberOne)); // Addition
        System.out.println("40 - 10 : " + (numberOne - numberTwo)); // Subtraction
        System.out.println("40 * 10 : " + (numberTwo * numberOne)); // Multiplication
        System.out.println("40 / 10 : " + (numberOne / numberTwo)); // Division
        System.out.println("40 % 10 : " + (numberOne % numberTwo)); // Modulo
        // Floor division operator(//) not available in Java since it is used for comments.
    }

    void assignmentOperators(){
        int numberThree = 30;
        int numberFour = 10;
        System.out.println("\nAssignment Operator");
        System.out.println("numberThree(30) += numberFour(10)  : " + (numberThree += numberFour)); // Addition assignment
        System.out.println("numberThree(40) -= numberFour(10)  : " + (numberThree -= numberFour)); // Subtraction assignment
        System.out.println("numberThree(30) *= numberFour(10)  : " + (numberThree *= numberFour)); // Multiplication assignment
        System.out.println("numberThree(300) /= numberFour(10) : " + (numberThree /= numberFour)); // Division assignment
        System.out.println("numberThree(30) %= numberFour(10)  : " + (numberThree %= numberFour)); // Modulo assignment
        System.out.println("NumberThree Final Value : " + numberThree);
    }

    void unaryOperators(){
         int numberFive = 10;
         System.out.println("\nUnary Operator");
         System.out.println("numberFive++ : " + numberFive++); // OP = 10. Since, it is post increment.
         System.out.println("numberFive-- : " + numberFive--); // OP = 11. Since, it is post decrement and it's value incremented in previous statement.
         System.out.println("++numberFive : " + ++numberFive); // OP = 11. Since, it is pre increment and it's value decremented in previous statement.
         System.out.println("--numberFive : " + --numberFive); // OP = 10. Since, it is pre decrement.
    }

    void logicalOperator(){
        System.out.println("\nLogical Operator");
        System.out.println("40 == 10 : " + (40 == 10)); // Equals to
        System.out.println("10 == 10 : " + (10 == 10)); // Equals to
        System.out.println("30 != 10 : " + (30 != 10)); // Not equals to
        System.out.println("30 != 30 : " + (30 != 30)); // Not equals to
        System.out.println("40 > 10 : " + (40 > 10)); // Greater than
        System.out.println("40 >= 10 : " + (40 >= 10)); // Greater than Equal to
        System.out.println("40 <= 10 : " + (40 <= 10)); // Lesser than Equal to
        System.out.println("40 < 10 : " + (40 < 10)); // Lesser than
    }
    public static void main(String[] args) {
         Operators o = new Operators(); // to call a non-static function from a static function class has to be instantiated.
         o.arithmeticOperators();
         o.assignmentOperators();
         o.unaryOperators();
         o.logicalOperator();
    }
}
