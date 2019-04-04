package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Prompts for two numbers and displays the sum of them.
 *
 */
public class Problem2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem2.class);

    public static void main(String...  args) {

        LOGGER.debug("Starting the app...");

        new Problem2();

        LOGGER.debug("Ending the app...");
    }

    private Problem2() {

        // The Scanner object is used to
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum:" + sum);
    }
}