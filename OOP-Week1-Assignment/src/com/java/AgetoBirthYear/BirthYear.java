package com.java.AgetoBirthYear;

import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int birthYear = currentYear - age;

        System.out.println(
                "Hello, "
                + name
                + "! If your age is " + age
                + " currently, you were born in "
                + birthYear
                + ".");
    }
}
