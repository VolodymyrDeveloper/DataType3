package Calc;

import java.util.Scanner;

public class RunCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calc is run. Please enter your first number!");
        System.out.println();
        Calculator calc1 = new Calculator();

        calc1.number1 = Double.parseDouble(scan.nextLine());

        System.out.println("Please enter your mathematical operation (for example + , - , * , / ");
        calc1.action = scan.nextLine();

        System.out.println("Please enter your next number!");
        calc1.number2 = Double.parseDouble(scan.nextLine());
        System.out.println("RESULT:");
        calc1.act();

    }
}
