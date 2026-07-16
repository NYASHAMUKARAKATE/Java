package org.nyashamukarakate.java.datastructures;

public class MarksAnalyzer {
    public static int findHighest(int[] marks) {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++)
            if (marks[i] > highest) highest = marks[i];
        return highest;
    }

    public static int findLowest(int[] marks) {
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++)
            if (marks[i] < lowest) lowest = marks[i];
        return lowest;
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (double) sum / marks.length;
    }

    public static void run() {
        System.out.println("\n--- Marks Analyzer Demo (Arrays + Static Methods) ---");
        int[] marks = {72, 88, 95, 61, 79, 84};
        System.out.println("  Marks   : 72 88 95 61 79 84");
        System.out.println("  Highest : " + findHighest(marks));
        System.out.println("  Lowest  : " + findLowest(marks));
        System.out.printf("  Average : %.2f%n", calculateAverage(marks));
    }
}
