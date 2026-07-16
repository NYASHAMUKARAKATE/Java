package org.nyashamukarakate.java.datastructures;

public class StudentMarkCalculator {
    public static void run() {
        System.out.println("\n--- Student Mark Calculator Demo (Variables + Arithmetic) ---");
        String name = "Nyasha";
        double maths = 85, science = 90, cs = 92;
        double total = maths + science + cs;
        double average = total / 3;
        double percentage = (total / 300) * 100;

        System.out.println("  Student   : " + name);
        System.out.printf("  Total     : %.1f / 300%n", total);
        System.out.printf("  Average   : %.1f%n", average);
        System.out.printf("  Percentage: %.1f%%%n", percentage);
    }
}
