package com.teachmeskills.lesson6.HW.Homework1;
import java.util.Scanner;
/*
Создать класс для описания студента нашей группы.
Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
Создать объекты этого класса для каждого из студента нашей группы.
Поместить все эти объекты в массив.
Пройти по массиву циклом for-each и вывести информацию на консоль.
 */

// Инициализация поля Student с параметрами (имя, фамилия, пол, возраст, номер паспорта, имя группы)
public class Student {
    public String firstName;
    public String lastName;
    public String genderIdentity;
    public String age;
    public String passportNumber;
    public String groupName;

    public Student(String firstName, String lastName, String genderIdentity, String age, String passportNumber, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genderIdentity = genderIdentity;
        this.age = age;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }

    public void studentInfo() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Gender Identity: " + this.genderIdentity);
        System.out.println("Age: " + this.age);
        System.out.println("Passport Number: " + this.passportNumber);
        System.out.println("Group Name: " + this.groupName);
    }

    // Ввод данных студента
    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Gender Identity: ");
        String genderIdentity = scanner.nextLine();
        System.out.println("Age: ");
        String age = scanner.nextLine();
        System.out.print("Passport Number: ");
        String passportNumber = scanner.nextLine();
        System.out.print("Group Name: ");
        String groupName = scanner.nextLine();

        return new Student(firstName, lastName, genderIdentity, age, passportNumber, groupName);
    }
}