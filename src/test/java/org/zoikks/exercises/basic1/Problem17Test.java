package org.zoikks.exercises.basic1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Runs binary addition tests against the Problem17 class.
 *
 */
public class Problem17Test extends Assert {

    private static final long ONE = 1L;
    private static final long TWO = 10L;
    private static final long THREE = 11L;
    private static final long FOUR = 100L;
    private static final long SIX = 110L;
    private static final long SEVEN = 111L;
    private static final long TEN = 1010L;
    private static final long THIRTEEN = 1101L;
    private static final long FOURTEEN = 1110L;
    private static final long TWENTY = 10100L;

    private List<Long> binaryNumbers;

    @Before
    public void setup() {
        this.binaryNumbers = new ArrayList<>();
    }

    @Test
    public void testSum1n1() {

        this.binaryNumbers.add(ONE);
        this.binaryNumbers.add(ONE);

        long sum = Problem17.sum(this.binaryNumbers);

        assertEquals(TWO, sum);
    }

    @Test
    public void testSum7n7() {

        this.binaryNumbers.add(SEVEN);
        this.binaryNumbers.add(SEVEN);

        long sum = Problem17.sum(this.binaryNumbers);

        assertEquals(FOURTEEN, sum);
    }

    @Test
    public void testSum3n4() {

        this.binaryNumbers.add(THREE);
        this.binaryNumbers.add(FOUR);

        long sum = Problem17.sum(this.binaryNumbers);

        assertEquals(SEVEN, sum);
    }

    @Test
    public void testSum6n7() {

        this.binaryNumbers.add(SIX);
        this.binaryNumbers.add(SEVEN);

        long sum = Problem17.sum(this.binaryNumbers);

        assertEquals(THIRTEEN, sum);
    }

    @Test
    public void testSum10n10() {

        this.binaryNumbers.add(TEN);
        this.binaryNumbers.add(TEN);

        long sum = Problem17.sum(this.binaryNumbers);

        assertEquals(TWENTY, sum);
    }
}