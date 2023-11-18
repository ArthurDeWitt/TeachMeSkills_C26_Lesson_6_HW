package com.teachmeskills.lesson6.HW.Homework1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CreateStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student details (or 'exit' to finish):");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            if (firstName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Gender Identity: ");
            String genderIdentity = scanner.nextLine();
            System.out.print("Age: ");
            String age = scanner.nextLine();
            System.out.print("Passport Number: ");
            String passportNumber = scanner.nextLine();
            System.out.print("Group Name: ");
            String groupName = scanner.nextLine();

            Student student = new Student(firstName, lastName, genderIdentity, age, passportNumber, groupName);
            students.add(student);
        }

        for (Student student : students) {
            student.studentInfo();
            System.out.println();
        }
    }
}