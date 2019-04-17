package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * This program determines if Java is installed on this computer.
 *
 */
public class Problem31 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem31.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the application...");

        new Problem31();

        LOGGER.debug("Ending the application...");
    }

    private Problem31() {

        LOGGER.debug("Java Version: " + System.getProperty("java.version"));
        LOGGER.debug("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        LOGGER.debug("Java Home: " + System.getProperty("java.home"));
        LOGGER.debug("Java Vendor: " + System.getProperty("java.vendor"));
        LOGGER.debug("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        LOGGER.debug("Java Classpath: " + System.getProperty("java.class.path"));
    }
}