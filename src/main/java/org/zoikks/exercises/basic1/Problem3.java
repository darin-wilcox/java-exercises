package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Divides two input numbers and displays the output.
 *
 */
public class Problem3 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem3.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        new Problem3();

        LOGGER.debug("Ending the app...");
    }

    private Problem3() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 / num2;

        System.out.println("Answer is: " + product);
    }
}