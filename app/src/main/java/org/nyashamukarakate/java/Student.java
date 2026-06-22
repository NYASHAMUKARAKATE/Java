package org.nyashamukarakate.java;
public class Student {
    String name;
    int id;
    int[] grades;

    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public double getAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + getAverage());
    }
    
}
