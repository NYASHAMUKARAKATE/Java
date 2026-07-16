package org.nyashamukarakate.java;

import org.nyashamukarakate.java.oop.animals.ZooApp;
import org.nyashamukarakate.java.oop.employees.CompanyApp;
import org.nyashamukarakate.java.oop.banking.BankManager;
import org.nyashamukarakate.java.oop.payments.PaymentApp;
import org.nyashamukarakate.java.oop.logistics.LogisticsManager;
import org.nyashamukarakate.java.datastructures.StudentManager;
import org.nyashamukarakate.java.datastructures.MarksAnalyzer;
import org.nyashamukarakate.java.datastructures.GradeBook;
import org.nyashamukarakate.java.datastructures.StudentMarkCalculator;
import org.nyashamukarakate.java.utils.NumberUtility;
import org.nyashamukarakate.java.utils.ScientificCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║     Java Learning Journey — Demo Runner      ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // OOP Demos
        ZooApp.run();
        CompanyApp.run();
        BankManager.run();
        PaymentApp.run();
        LogisticsManager.run();

        // Data Structures Demos
        StudentMarkCalculator.run();
        StudentManager.run();
        MarksAnalyzer.run();
        GradeBook.run();

        // Utilities Demos
        NumberUtility.run();
        ScientificCalculator.run();

        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("  All demos complete.");
    }
}
