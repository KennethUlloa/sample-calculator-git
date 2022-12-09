package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==== Calculator Execute ====");
        Calculator c = new Calculator();
        System.out.println("addition(5,6) => " + c.addition(5, 6));
        System.out.println("subtraction(10,3) => " + c.subtraction(10, 3));
        System.out.println("multiplication(6,4) => " + c.multiplication(6, 4));
        System.out.println("division(15,3) => " + c.division(15, 3));
        System.out.println("==== Calculator Execute ====");

    }
}
