package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem9 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem9.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        new Problem9();

        LOGGER.debug("Ending the app...");
    }

    private Problem9() {

        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        LOGGER.debug("Result: " + result);
    }
}