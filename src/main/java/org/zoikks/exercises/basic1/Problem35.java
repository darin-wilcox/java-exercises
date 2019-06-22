package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 *
 * Application to calculate the area of a polygon.
 *
 * Example:  Area of a polygon = (n*s^2)/(4*tan(π/n))
 *
 *          where n is n-sided polygon and s is the length of a side
 *
 */
public class Problem35 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem35.class);

    public static void main(String... args) {
        new Problem35();
    }

    private Problem35() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon: ");
        int n = scanner.nextInt();

        System.out.print("Input the length of one of the sides: ");
        int s = scanner.nextInt();

        double firstHalf = n * Math.pow(s, 2);

        double secondHalf = 4 * (Math.tan(Math.PI/n));

        double polygonArea = firstHalf/secondHalf;

        LOGGER.debug("The area is: " + polygonArea);
    }
}