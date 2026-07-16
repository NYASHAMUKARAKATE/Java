package org.nyashamukarakate.java.datastructures;

public class StudentManager {
    public static void run() {
        System.out.println("\n--- Student Manager Demo (Arrays + Objects) ---");
        Student[] students = {
            new Student("Nyasha",     1, new int[]{85, 90, 78}),
            new Student("Mukarakate", 2, new int[]{92, 88, 95}),
            new Student("Tendai",     3, new int[]{70, 75, 80})
        };
        for (Student s : students) s.displayInfo();
    }
}
