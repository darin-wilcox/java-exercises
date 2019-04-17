package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Java program that compares two numbers.
 *
 */
public class Problem32 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem32.class);

    public static void main(String... args) {

        LOGGER.debug("Staring application...");

        new Problem32();

        LOGGER.debug("Ending application...");
    }

    private Problem32() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int int1 = scanner.nextInt();

        System.out.print("Input second integer: ");
        int int2 = scanner.nextInt();

        if (int1 > int2) {
            LOGGER.debug(int1 + " > " + int2);
        }

        if (int1 < int2) {
            LOGGER.debug(int1 + " < " + int2);
        }

        if (int1 == int2) {
            LOGGER.debug(int1 + " == " + int2);
        }

        if (int1 != int2) {
            LOGGER.debug(int1 + " != " + int2);
        }

        if (int1 >= int2) {
            LOGGER.debug(int1 + " >= " + int2);
        }

        if (int1 <= int2) {
            LOGGER.debug(int1 + " <= " + int2);
        }
    }
}