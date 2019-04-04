package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * A program that adds two binary numbers and displays the result.
 *
 */
public class Problem17 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem17.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        new Problem17();

        LOGGER.debug("Stopping the app...");
    }

    private Problem17() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert first binary number: ");
        long bin1 = scanner.nextLong();

        System.out.print("Insert secondary binary number: ");
        long bin2 = scanner.nextLong();
        int remainder = 0;
        String result = "";

        do {
            int pos1 = (int)bin1 % 10;
            int pos2 = (int)bin2 % 10;

            int posTotal = pos1 + pos2 + remainder;

            if (posTotal > 1) {
                posTotal = 0;
                remainder = 1;
            } else {
                remainder = 0;
            }

            result = posTotal + result;

            bin1 /= 10;
            bin2 /= 10;

        } while (bin1 > 0 || bin2 > 0);

        if (remainder != 0) {
            result = 1 + result;
        }

        System.out.println("Total binary number is: " + result);
    }
}