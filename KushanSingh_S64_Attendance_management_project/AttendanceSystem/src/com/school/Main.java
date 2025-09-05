package com.school.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System!");

        // Create Students
        Student[] students = new Student[3];
        students[0] = new Student(1, "Alice");
        students[1] = new Student(2, "Bob");
        students[2] = new Student(3, "Charlie");

        // Create Courses
        Course[] courses = new Course[2];
        courses[0] = new Course(101, "Mathematics");
        courses[1] = new Course(102, "Science");

        // Display Students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayStudent();
        }

        // Display Courses
        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayCourse();
        }
    }
}