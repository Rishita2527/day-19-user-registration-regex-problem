package com.bridgelabz.UserRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        System.out.println("Enter First Name: ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }
}
