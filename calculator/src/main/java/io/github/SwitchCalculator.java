package io.github;

import java.util.Scanner;

public class SwitchCalculator {

    public void switchCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter operator: (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();


        double result;
        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error! Division by zero");
                    return;
                }
            }
            case '%' -> result = firstNumber % secondNumber;
            default -> {
                System.out.println("Error! Invalid operator");
                return;
            }
        }
        System.out.println("Result: "+ result);
   }
}
