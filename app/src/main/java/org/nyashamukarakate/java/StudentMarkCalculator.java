package org.nyashamukarakate.java;
import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int totalSubjects = 3;

        System.out.println("Welcome to the student grading system");
        System.out.print("Enter your Name");
        String name = scanner.nextLine();
        System.out.print("\nEnter marks below");
        System.out.print("\nMaths : ");
        double mathsMarks = scanner.nextDouble();
        System.out.print("\nScience : ");
        double scienceMarks = scanner.nextDouble();
        System.out.print("\nComputer Science: ");
        double computerScienceMarks = scanner.nextDouble();


        double totalMarks = mathsMarks + scienceMarks + computerScienceMarks;
        double averageMarks = totalMarks / totalSubjects;
        double percentage = (totalMarks / (totalSubjects * 100)) * 100;
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
    
}
