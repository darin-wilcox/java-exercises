package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Create a binary number from a decimal input and display the result.
 *
 */
public class Problem19 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem19.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a decimal number: ");
        long decimal = scanner.nextLong();

        System.out.println("Binary equivalent: " + convertDecimalToBinary(decimal));

        LOGGER.debug("Ending the app...");
    }

    static long convertDecimalToBinary(long decimal) {

        int divisor = 1;

        while (decimal / divisor > 1) {
            divisor *= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (divisor > 0) {

            if (decimal >= divisor) {
                sb.append("1");
                decimal -= divisor;
            } else {
                sb.append("0");
            }

            divisor /= 2;
        }

        return Long.valueOf(sb.toString());
    }
}