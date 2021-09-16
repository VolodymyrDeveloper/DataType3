package Calc;

public class Calculator {
    double number1, number2, result;
    String action;

    void act() {
        switch (action) {
            case "+":
                result = number1 + number2;
                System.out.println(result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(result);
                break;
            default:
                System.out.println("This mathematical operation does not exist!");
        }
    }

}

