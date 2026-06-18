package org.nyashamukarakate.java;
import java.util.Scanner;

public class NumberUtility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean runner = true;
        
        do{
            System.out.println("======= Number Utility Program =======");

            System.out.println("1. Generate Multiplication Table");
            System.out.println("2. Calculate Sum on N numbers");
            System.out.println("3. Calculate Factorial of a number");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to generate the multiplication table: ");
                    int number = scanner.nextInt();
                    System.out.println("Multiplication Table of " + number + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(number + " x " + i + " = " + (number * i));
                    }
                    break;

                case 2:
                    System.out.println("Enter the an integer N to calculate the sum of first N numbers: ");
                    int n = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                    }
                    System.out.println("Sum of first " + n + " numbers is: " + sum);
                    break;
                case 3:
                    System.out.print("Enter a number to calculate its factorial: ");
                    int num = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    runner = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while (runner);

    }
}
