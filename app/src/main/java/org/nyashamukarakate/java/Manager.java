package org.nyashamukarakate.java;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
        this.bonus = 20.0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

}
