package org.nyashamukarakate.java;

public class CompanyApp {
    public static void main(String[] args) {
       
        Employee developer = new Developer("Nyasha", 0, 200, "Java");
        developer.calculateSalary();

        Employee manager = new Manager("Mukarakate", 1, 300);
        manager.calculateSalary();
    }
}
