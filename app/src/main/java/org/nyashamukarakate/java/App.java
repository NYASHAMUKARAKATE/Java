package org.nyashamukarakate.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Details Below");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("\nAge : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nUniversity : ");
        String university = scanner.nextLine();

        System.out.println("\nYour Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("University : " + university);

        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.println("\nadult.");
        } else {
            System.out.println("\nChild");
        }

       
    }
}
