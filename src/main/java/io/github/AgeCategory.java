package io.github;

import java.util.Scanner;

public class AgeCategory {
    Scanner scanner = new Scanner(System.in);

    public static void displayAgeCategory() {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if(age <= 2){
            System.out.println("You are a infant");
        } else if(age >= 3 && age <= 12){
            System.out.println("You are a child");
        } else if(age >= 13 && age <=19){
            System.out.println("You are a teenager");
        } else if(age >= 20 && age <= 64){
            System.out.println("You are an adult");
        } else if(age >= 65){
            System.out.println("You are a senior");
        }
    }
}
