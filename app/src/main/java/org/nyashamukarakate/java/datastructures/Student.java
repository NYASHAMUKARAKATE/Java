package org.nyashamukarakate.java.datastructures;

public class Student {
    private String name;
    private int id;
    private int[] grades;

    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public double getAverage() {
        int sum = 0;
        for (int grade : grades) sum += grade;
        return (double) sum / grades.length;
    }

    public void displayInfo() {
        System.out.printf("  Student %-12s (ID: %d) | Avg: %.1f%n", name, id, getAverage());
    }
}
