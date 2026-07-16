package org.nyashamukarakate.java.utils;

public class NumberUtility {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void run() {
        System.out.println("\n--- Number Utility Demo (Loops + Methods) ---");
        int n = 5;
        System.out.println("  Multiplication table of 7:");
        for (int i = 1; i <= 5; i++)
            System.out.printf("    7 x %d = %d%n", i, 7 * i);
        System.out.println("  Sum of 1.." + n + " = " + sumToN(n));
        System.out.println("  Factorial of " + n + " = " + factorial(n));
    }
}
