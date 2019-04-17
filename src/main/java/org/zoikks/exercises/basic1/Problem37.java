package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Reverses a String value and displays it.
 *
 */
public class Problem37 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem37.class);

    public static void main(String... args) {

        LOGGER.debug("Application starting...");

        new Problem37();

        LOGGER.debug("Application ending...");
    }

    private Problem37() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();

        StringBuilder reverseBuilder = new StringBuilder();

        for (char c : chars) {
            reverseBuilder.insert(0, c);
        }

        LOGGER.debug("Reversed String: " + reverseBuilder.toString());
    }
}