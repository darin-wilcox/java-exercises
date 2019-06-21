package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * This is a program to compare two numbers.
 *
 */
public class Problem32 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem32.class);

    public static void main(String... args) {

        new Problem32();
    }

    private Problem32() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int first = scanner.nextInt();

        System.out.print("Input second integer: ");
        int second = scanner.nextInt();

        if (first < second) {
            LOGGER.debug(first + " < " + second);
        }

        if (first > second) {
            LOGGER.debug(first + " > " + second);
        }

        if (first <= second) {
            LOGGER.debug(first + " <= " + second);
        }

        if (first >= second) {
            LOGGER.debug(first + " >= " + second);
        }

        if (first != second) {
            LOGGER.debug(first + " != " + second);
        }

        if (first == second) {
            LOGGER.debug(first + " == " + second);
        }
    }
}