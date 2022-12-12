package com.bridgelabz.UserRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {

	public static void main(String[] args) {
		  System.out.println("Welcome to user registration program");
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter first Name : ");
		  String firstName = scanner.next();
		  System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
     }
}
