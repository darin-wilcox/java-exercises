package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 *
 * Write a Java program to check whether Java is installed on your computer.
 *
 * Primarily learning the following environment variables:
 *  - java.version
 *  - java.runtime.version
 *  - java.home
 *  - java.vendor
 *  - java.vendor.url
 *  - java.class.path
 *
 */
public class Problem31 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem31.class);

    public static void main(String... args) {

        new Problem31();
    }

    private Problem31() {

        LOGGER.debug("Java Version: " + System.getProperty("java.version"));
        LOGGER.debug("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        LOGGER.debug("Java Home: " + System.getProperty("java.home"));
        LOGGER.debug("Java Vendor: " + System.getProperty("java.vendor"));
        LOGGER.debug("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        LOGGER.debug("Java Class Path: " + System.getProperty("java.class.path"));

        System.getProperties().forEach((k, v) -> LOGGER.debug("Key: " + k));
    }
}