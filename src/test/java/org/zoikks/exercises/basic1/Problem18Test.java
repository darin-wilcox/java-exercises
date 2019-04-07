package org.zoikks.exercises.basic1;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 *
 * Tests the multiplication of binary numbers using the Problem18 class.
 *
 */
public class Problem18Test extends Assert {

    private static final long ZERO = 0L;
    private static final long ONE = 1L;
    private static final long FIVE = 101L;
    private static final long TWENTY_FIVE = 11001L;

    @Test
    public void testMultiply5n5() {

        List<Long> intermediate = Problem18.multiply(FIVE, FIVE);

        assertEquals(TWENTY_FIVE, Problem17.sum(intermediate));
    }

    @Test
    public void testMultiply0n5() {

        List<Long> intermediate = Problem18.multiply(ZERO, FIVE);

        assertEquals(ZERO, Problem17.sum(intermediate));
    }

    @Test
    public void testMultiply5n0() {

        List<Long> intermediate = Problem18.multiply(FIVE, ZERO);

        assertEquals(ZERO, Problem17.sum(intermediate));
    }

    @Test
    public void testMultiply1n25() {

        List<Long> intermediate = Problem18.multiply(ONE, TWENTY_FIVE);

        assertEquals(TWENTY_FIVE, Problem17.sum(intermediate));
    }
}