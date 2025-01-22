package com.ontariotechu.sofe3980U;

import java.util.Scanner;

/**
 * Main program
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-------------------  Welcome to the Binary Calculator!  -------------------\n");

        // Get the first binary number from the user
        System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();
        Binary binary1 = new Binary(binary1Input);

        // Get the second binary number from the user
        System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();
        Binary binary2 = new Binary(binary2Input);

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("\nResult of ADD: " + sum.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("Result of AND: " + andResult.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("Result of OR: " + orResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Result of MULTIPLY: " + multiplyResult.getValue());

        System.out.println("\n-------------------   Exiting the Binary Calculator!  ------------------- \n");

        scanner.close();
    }
}