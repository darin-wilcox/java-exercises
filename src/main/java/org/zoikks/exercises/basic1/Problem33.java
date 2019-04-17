package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Computes the sum of the digits of an integer.
 *
 */
public class Problem33 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem33.class);

    public static void main(String... args) {

        LOGGER.debug("Starting application...");

        new Problem33();

        LOGGER.debug("Ending application...");
    }

    private Problem33() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input integer: ");
        int integer = scanner.nextInt();
        int sum = 0;

        do {
            sum += integer % 10;
        } while ((integer /= 10) > 0);

        LOGGER.debug("Sum: " + sum);
    }
}