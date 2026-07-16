package org.nyashamukarakate.java.oop.employees;

public class CompanyApp {
    public static void run() {
        System.out.println("\n--- Company Payroll Demo (Inheritance) ---");
        Employee developer = new Developer("Nyasha", 1, 2000, "Java");
        Employee manager = new Manager("Mukarakate", 2, 3000);

        System.out.printf("Developer %s salary: $%.2f%n", developer.getName(), developer.calculateSalary());
        System.out.printf("Manager   %s salary: $%.2f%n", manager.getName(), manager.calculateSalary());
    }
}
