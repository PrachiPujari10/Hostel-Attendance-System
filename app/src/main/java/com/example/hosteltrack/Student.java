package com.example.hosteltrack;

public class Student {
    private String uuid;
    private String name;
    private String contactNumber; // New field for the contact number
    private String enrollmentNumber; // New field for enrollment number
    private String time; // New field for time

    // Required empty public constructor for Firestore
    public Student() {
    }

    public Student(String uuid, String name, String contactNumber) {
        this.uuid = uuid;
        this.name = name;
        this.contactNumber = contactNumber;
    }
    // Updated constructor to include the contact number, enrollment number, and time
    public Student(String uuid, String name, String contactNumber, String enrollmentNumber, String time) {
        this.uuid = uuid;
        this.name = name;
        this.contactNumber = contactNumber;
        this.enrollmentNumber = enrollmentNumber;
        this.time = time;
    }

    // Getter for UUID
    public String getUuid() {
        return uuid;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // New getter for the contact number
    public String getContactNumber() {
        return contactNumber;
    }

    // New getter for the enrollment number
    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    // New getter for the time
    public String getTime() {
        return time;
    }

    // If needed, you can also add setters for these fields.
    // For example, a setter for the contact number:
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Similarly, add setters for other fields if necessary
}
