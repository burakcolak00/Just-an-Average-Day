package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculationsUsingForLoopTest {
    CalculationsUsingForLoop calculations = new CalculationsUsingForLoop();
    int[] nums = {1, 2, 3, 4, 5};

    @Test
    void testMaximum() {
        assertEquals(5, calculations.maximumUsingForLoop(nums));
    }

    @Test
    void testMinimum() {
        assertEquals(1, calculations.minimumUsingForLoop(nums));
    }

    @Test
    void testSum() {
        assertEquals(15, calculations.sumUsingForLoop(nums));
    }

    @Test
    void testAverage() {
        assertEquals(3, calculations.averageUsingForLoop(nums));
    }

    @Test
    void testEmptyArray() {
        int[] empytyNums = {};
        assertEquals(0, calculations.averageUsingForLoop(empytyNums));
        assertEquals(Integer.MIN_VALUE, calculations.maximumUsingForLoop(empytyNums));
        assertEquals(Integer.MAX_VALUE, calculations.minimumUsingForLoop(empytyNums));
        assertEquals(0, calculations.sumUsingForLoop(empytyNums));
    }

    @Test
    void testSingleElementArray() {
        int[] singleNum = {42};
        assertEquals(42, calculations.maximumUsingForLoop(singleNum));
        assertEquals(42, calculations.minimumUsingForLoop(singleNum));
        assertEquals(42, calculations.sumUsingForLoop(singleNum));
        assertEquals(42, calculations.averageUsingForLoop(singleNum));
    }

    @Test
    void testNegativeNumbers() {
        int[] negativeNums = {-1, -2, -3, -4, -5};
        assertEquals(-1, calculations.maximumUsingForLoop(negativeNums));
        assertEquals(-5, calculations.minimumUsingForLoop(negativeNums));
        assertEquals(-15, calculations.sumUsingForLoop(negativeNums));
        assertEquals(-3, calculations.averageUsingForLoop(negativeNums));
    }

    @Test
    void testMixedNumbers() {
        int[] mixedNums = {-1, 0, 1, 2, -2};
        assertEquals(2, calculations.maximumUsingForLoop(mixedNums));
        assertEquals(-2, calculations.minimumUsingForLoop(mixedNums));
        assertEquals(0, calculations.sumUsingForLoop(mixedNums));
        assertEquals(0, calculations.averageUsingForLoop(mixedNums));
    }

    @Test
    void testLargeNumbers() {
        int[] largeNums = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        assertEquals(Integer.MAX_VALUE, calculations.maximumUsingForLoop(largeNums));
        assertEquals(Integer.MIN_VALUE, calculations.minimumUsingForLoop(largeNums));
        assertEquals(Integer.MAX_VALUE + Integer.MIN_VALUE, calculations.sumUsingForLoop(largeNums));
        assertEquals(0, calculations.averageUsingForLoop(largeNums));
    }

    @Test
    void testAllSameNumbers() {
        int[] sameNums = {7, 7, 7, 7};
        assertEquals(7, calculations.maximumUsingForLoop(sameNums));
        assertEquals(7, calculations.minimumUsingForLoop(sameNums));
        assertEquals(28, calculations.sumUsingForLoop(sameNums));
        assertEquals(7, calculations.averageUsingForLoop(sameNums));
    }

}
