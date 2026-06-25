package org.nyashamukarakate.java;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double baseSalary, String programmingLanguage) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateSalary() {
        System.out.println("Calculating salary for Developer: " + getName());
        System.out.println("Programming Language: " + getProgrammingLanguage());
        System.out.println("Base Salary: " + getBaseSalary());
        System.out.println("Calculated Salary: " + (super.calculateSalary() * 1.2));
        return super.calculateSalary() * 1.2; // Assuming a 20% bonus for developers
    }
}
