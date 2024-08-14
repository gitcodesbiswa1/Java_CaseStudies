package com.cs;
import java.util.Scanner;


public class CaseStudyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a double value: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("That's not a valid double. Try again.");
            scanner.next(); 
        }
        double doubleValue = scanner.nextDouble();
        System.out.println("Double value entered: " + doubleValue);

     
        System.out.print("Enter a boolean value (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("That's not a valid boolean. Try again.");
            scanner.next(); 
        }
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value entered: " + booleanValue);

  
        System.out.println("Checking for next token...");
        boolean hasNext = scanner.hasNext();
        System.out.println("Has next token: " + hasNext);

      
        System.out.println("Checking for next integer...");
        boolean hasNextInt = scanner.hasNextInt();
        System.out.println("Has next integer: " + hasNextInt);

        
        System.out.println("Checking for next line...");
        boolean hasNextLine = scanner.hasNextLine();
        System.out.println("Has next line: " + hasNextLine);

        scanner.close();
    }
}
