package org.zoikks.exercises.basic1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * A program that adds two binary numbers and displays the result.
 *
 * Example:
 *              111
 *              +11
 *              ---
 *             1010
 *
 */
public class Problem17 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem17.class);

    public static void main(String... args) {

        LOGGER.debug("Starting the app...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert first binary number: ");
        long bin1 = scanner.nextLong();

        System.out.print("Insert secondary binary number: ");
        long bin2 = scanner.nextLong();

        List<Long> binaryNums = new ArrayList<>();
        binaryNums.add(bin1);
        binaryNums.add(bin2);

        System.out.println("Total binary number is: " + sum(binaryNums));

        LOGGER.debug("Stopping the app...");
    }

    static long sum(List<Long> binaryNums) {

        long sum = 0;

        for (long binaryNum : binaryNums) {

            int remainder = 0;
            long bin1 = sum;

            StringBuilder sb = new StringBuilder();

            do {
                int pos1 = (int)bin1 % 10;
                int pos2 = (int)(binaryNum % 10);

                int posTotal = pos1 + pos2 + remainder;

                if (posTotal > 1) {
                    posTotal %= 2;
                    remainder = 1;
                } else {
                    remainder = 0;
                }

                sb.insert(0, posTotal);

                bin1 /= 10;
                binaryNum /= 10;

            } while (bin1 > 0 || binaryNum > 0);

            if (remainder != 0) {
                sb.insert(0, 1);
            }

            sum = Long.valueOf(sb.toString());
        }

        return sum;
    }
}