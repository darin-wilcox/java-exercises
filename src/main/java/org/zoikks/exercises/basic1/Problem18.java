package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Multiplies two binary numbers and displays the output.
 *
 * Example:
 *                  111
 *                 *111
 *                 -----
 *                  111
 *                 1110
 *               +11100
 *               ------
 *               110001
 *
 *
 * Please note that this requires the use of class Problem17 in order sum up the totals.
 *
 */
public class Problem18 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem18.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert first binary number: ");
        long bin1 = scanner.nextLong();

        System.out.print("Insert second binary number: ");
        long bin2 = scanner.nextLong();

        System.out.println("Total binary number is: " + Problem17.sum(multiply(bin1, bin2)));

        LOGGER.debug("Ending the app...");
    }

    static List<Long> multiply(long bin1, long bin2) {

        List<Long> binaryNumbers = new ArrayList<>();

        int position = 0;

        while (bin2 > 0) {
            int pos2 = (int)bin2 % 10;

            String val = "0".repeat(position);

            binaryNumbers.add(Long.valueOf((bin1 * pos2) + val));

            position++;
            bin2 /= 10;
        }

        return binaryNumbers;
    }
}