package org.nyashamukarakate.java;
import java.util.Scanner;

public class GradeBook {
    public static void printRowAverage(int[][] gradeBook) {
        for (int student = 0; student < gradeBook.length; student++) {
            int sum = 0;
            for (int subject = 0; subject < gradeBook[student].length; subject++) {
                sum += gradeBook[student][subject];
            }
            double average = (double) sum / gradeBook[student].length;
            System.out.println("Average for student " + (student + 1) + ": " + average);
        }
    }
    public static void getClassAverage(int[][] gradeBook) {
        int totalSum = 0;
        int totalSubjects = 0;
        for (int student = 0; student < gradeBook.length; student++) {
            for (int subject = 0; subject < gradeBook[student].length; subject++) {
                totalSum += gradeBook[student][subject];
                totalSubjects++;
            }
        }
        double classAverage = (double) totalSum / totalSubjects;
        System.out.println("Class Average: " + classAverage);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[][] gradeBook = new int[numStudents][numSubjects];
        for (int student = 0; student < numStudents; student++) {
            for (int subject = 0; subject < numSubjects; subject++) {
                System.out.print("Enter grade for student " + (student + 1) + " and subject " + (subject + 1) + ": ");
                gradeBook[student][subject] = scanner.nextInt();
            }
        }
        System.out.println("Grade Book:");
        for (int student = 0; student < numStudents; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int subject = 0; subject < numSubjects; subject++) {
                System.out.print(gradeBook[student][subject] + " ");
            }
            System.out.println();
        }

        printRowAverage(gradeBook);
        getClassAverage(gradeBook);

        scanner.close();
    }
    
}
