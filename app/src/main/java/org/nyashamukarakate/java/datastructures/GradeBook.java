package org.nyashamukarakate.java.datastructures;

public class GradeBook {
    public static void printRowAverages(int[][] gradeBook) {
        for (int s = 0; s < gradeBook.length; s++) {
            int sum = 0;
            for (int g : gradeBook[s]) sum += g;
            System.out.printf("  Student %d average: %.1f%n", s + 1, (double) sum / gradeBook[s].length);
        }
    }

    public static double getClassAverage(int[][] gradeBook) {
        int totalSum = 0, totalCount = 0;
        for (int[] row : gradeBook) { for (int g : row) { totalSum += g; totalCount++; } }
        return (double) totalSum / totalCount;
    }

    public static void run() {
        System.out.println("\n--- Grade Book Demo (2D Arrays) ---");
        int[][] gradeBook = {
            {85, 90, 78},
            {92, 88, 95},
            {70, 75, 80}
        };
        printRowAverages(gradeBook);
        System.out.printf("  Class average: %.2f%n", getClassAverage(gradeBook));
    }
}
