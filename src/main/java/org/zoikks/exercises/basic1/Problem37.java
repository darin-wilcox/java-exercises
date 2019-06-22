package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * A program that demonstrates how to reverse a String.
 *
 */
public class Problem37 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem37.class);

    public static void main(String... args) {

        new Problem37();
    }

    private Problem37() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = input.length() -1 ; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }

        LOGGER.debug("Reverse string: " + stringBuilder);
    }
}