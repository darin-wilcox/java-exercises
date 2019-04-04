package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Write a Java program to print 'Hello' on screen and then print your name on a separate line.
 *
 */
public class Problem1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem1.class);

    private static final String HELLO = "Hello";
    private static final String NAME = "[MY_NAME]";

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        new Problem1();

        LOGGER.debug("Ending the app...");
    }

    private Problem1() {

        System.out.println(HELLO);
        System.out.println(NAME);
    }
}