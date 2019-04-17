package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Example of counting totals of character types within a String (ie alpha, spaces, numbers, etc)
 *
 */
public class Problem38 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem38.class);

    public static void main(String... args) {

        LOGGER.debug("Starting application...");

        new Problem38();

        LOGGER.debug("Ending application...");
    }

    private Problem38() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a String: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int alphas = 0, digits = 0, spaces = 0, other = 0;

        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                alphas++;
            }
            else if (Character.isDigit(c)) {
                digits++;
            }
            else if (Character.isSpaceChar(c)) {
                spaces++;
            } else {
                other++;
            }
        }

        LOGGER.debug("Letters: " + alphas);
        LOGGER.debug("Numbers: " + digits);
        LOGGER.debug("Spaces: " + spaces);
        LOGGER.debug("Others: " + other);
    }
}