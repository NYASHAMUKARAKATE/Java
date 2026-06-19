package org.nyashamukarakate.java;
import java.util.Scanner;

public class MarksAnalyzer {
    public static int findHighest(int[] marks){
        int highest = marks[0];
        for(int i = 1; i < marks.length; i++){
            if(marks[i] > highest){
                highest = marks[i];
            }
        }
        return highest;
    }
    public static int findLowest(int[] marks){
        int lowest = marks[0];
        for(int i = 1; i < marks.length; i++){
            if(marks[i] < lowest){
                lowest = marks[i];
            }
        }
        return lowest;
    }
    public static double calculateAverage(int[] marks){
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] marks = new int[numStudents];

        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int highestMark = findHighest(marks);
        int lowestMark = findLowest(marks);
        double averageMark = calculateAverage(marks);

        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);
        System.out.println("Average Mark: " + averageMark);
    }
    
}
