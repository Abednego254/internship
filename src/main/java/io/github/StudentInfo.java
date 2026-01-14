package io.github;


import java.util.Scanner;

public class StudentInfo {
    Scanner scanner = new Scanner(System.in);

    public void displayInfo() {
        System.out.println("Age: ");
        int age = scanner.nextInt(); // age = 25/n
        System.out.println("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Grade: ");
        String grade = scanner.nextLine();
        System.out.println("Graduating?: (True or False )");
        boolean isGraduating = scanner.nextBoolean();
        System.out.println("GPA: ");
        int gpa = scanner.nextInt();

        scanner.close();
    }
}
