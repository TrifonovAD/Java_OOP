package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write two numbers and +, -, * or / sign");
        char mathSign = 0;
        double leftDigital = 0;
        double rightDigital = 0;
        try {
            leftDigital = scanner.nextDouble();
            rightDigital = scanner.nextDouble();
            mathSign = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        }
        Calculator calculator = new Calculator();
        System.out.println(calculator.makeCalculation(leftDigital, rightDigital, mathSign));
    }
}
