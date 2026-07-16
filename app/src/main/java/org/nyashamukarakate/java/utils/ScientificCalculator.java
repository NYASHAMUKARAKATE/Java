package org.nyashamukarakate.java.utils;

public class ScientificCalculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double multiply(double a, double b, double c) { return a * b * c; }

    public static double divide(double a, double b) {
        if (b == 0) { System.out.println("  Error: division by zero."); return 0; }
        return a / b;
    }

    public static void run() {
        System.out.println("\n--- Scientific Calculator Demo (Method Overloading) ---");
        System.out.printf("  10 + 5   = %.1f%n", add(10, 5));
        System.out.printf("  10 - 5   = %.1f%n", subtract(10, 5));
        System.out.printf("  10 * 5   = %.1f%n", multiply(10, 5));
        System.out.printf("  10 / 5   = %.1f%n", divide(10, 5));
        System.out.printf("  2 * 3 * 4 = %.1f%n", multiply(2, 3, 4));
    }
}
