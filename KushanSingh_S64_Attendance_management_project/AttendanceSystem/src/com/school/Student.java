package com.school.school;

public class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Display method
    public void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

    }
}