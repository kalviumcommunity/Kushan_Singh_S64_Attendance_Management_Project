package com.school.school;

public class Course {
    private int courseId;
    private String courseName;

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getter methods
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // Display method
    public void displayCourse() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }

    public static void main(String[] args) {

    }
}