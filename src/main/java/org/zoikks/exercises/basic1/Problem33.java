package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * Asks for input of a number and sums all the digits in the given number.
 *
 */
public class Problem33 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem33.class);

    public static void main(String... args) {

        new Problem33();
    }

    private Problem33() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        BigInteger original = scanner.nextBigInteger();

        int sums = 0;

        while (original.compareTo(BigInteger.ZERO) > 0) {

            BigInteger modulo = original.mod(BigInteger.TEN);
            sums += modulo.intValue();
            original = original.divide(BigInteger.TEN);
        }

        LOGGER.debug("Total Value: " + sums);
    }
}