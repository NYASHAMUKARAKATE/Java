package org.nyashamukarakate.java;
import java.util.Scanner;

public class ScientificCalculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Ooops ! Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }
    public static double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runner = true;

        do {
            System.out.println("======= Scientific Calculator Program =======");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Multiplication of three numbers");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double addNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addNum2 = scanner.nextDouble();
                    double sum = add(addNum1, addNum2);
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subNum2 = scanner.nextDouble();
                    double difference = subtract(subNum1, subNum2);
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum2 = scanner.nextDouble();
                    double product = multiply(mulNum1, mulNum2);
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double divNum2 = scanner.nextDouble();
                    double quotient = divide(divNum1, divNum2);
                    if (divNum2 != 0) {
                        System.out.println("Result: " + quotient);
                    }
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    double mulNum3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum4 = scanner.nextDouble();
                    System.out.print("Enter third number: ");
                    double mulNum5 = scanner.nextDouble();
                    double productThree = multiply(mulNum3, mulNum4, mulNum5);
                    System.out.println("Result: " + productThree);
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    runner = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (runner);
    }
}
