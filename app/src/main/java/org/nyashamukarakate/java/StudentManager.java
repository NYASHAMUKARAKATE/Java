package org.nyashamukarakate.java;

public class StudentManager {
    public static void main(String[] args) {
        Student student1 = new Student("Nyasha", 1, new int[]{85, 90, 78});
        Student student2 = new Student("Mukarakate", 2, new int[]{92, 88, 95});
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        
    }
}
