package org.zoikks.exercises.basic1;

import org.junit.Assert;
import org.junit.Test;

public class Problem19Test extends Assert {

    private static final long ZERO = 0;
    private static final long TWENTY_FOUR = 11000;
    private static final long NINE = 1001;

    @Test
    public void testConvertDecimalToBinary0() {

        assertEquals(ZERO, Problem19.convertDecimalToBinary(0L));
    }

    @Test
    public void testConvertDecimal24ToBinary() {

        assertEquals(TWENTY_FOUR, Problem19.convertDecimalToBinary(24));
    }

    @Test
    public void testConvertDecimal9ToBinary() {

        assertEquals(NINE, Problem19.convertDecimalToBinary(9));
    }
}