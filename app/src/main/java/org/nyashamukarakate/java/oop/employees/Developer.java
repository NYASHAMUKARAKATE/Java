package org.nyashamukarakate.java.oop.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double baseSalary, String programmingLanguage) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public void setProgrammingLanguage(String lang) { this.programmingLanguage = lang; }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.2; // 20% bonus
    }
}
