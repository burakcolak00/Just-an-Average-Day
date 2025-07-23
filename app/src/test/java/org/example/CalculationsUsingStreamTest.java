package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculationsUsingStreamTest {
    CalculationsUsingStream calculations = new CalculationsUsingStream();
    int[] nums = {1, 2, 3, 4, 5};

    @Test
    void testMaximum() {
        assertEquals(5, calculations.maximumUsingStream(nums));
    }

    @Test
    void testMinimum() {
        assertEquals(1, calculations.minimumUsingStream(nums));
    }

    @Test
    void testSum() {
        assertEquals(15, calculations.sumUsingStream(nums));
    }

    @Test
    void testAverage() {
        assertEquals(3, calculations.averageUsingStream(nums));
    }

    @Test
    void testEmptyArray() {
        int[] emptyNums = {};
        assertEquals(0, calculations.averageUsingStream(emptyNums));
        assertEquals(Integer.MIN_VALUE, calculations.maximumUsingStream(emptyNums));
        assertEquals(Integer.MAX_VALUE, calculations.minimumUsingStream(emptyNums));
        assertEquals(0, calculations.sumUsingStream(emptyNums));
    }

    @Test
    void testSingleElementArray() {
        int[] singleNum = {42};
        assertEquals(42, calculations.maximumUsingStream(singleNum));
        assertEquals(42, calculations.minimumUsingStream(singleNum));
        assertEquals(42, calculations.sumUsingStream(singleNum));
        assertEquals(42, calculations.averageUsingStream(singleNum));
    }

    @Test
    void testNegativeNumbers() {
        int[] negativeNums = {-1, -2, -3, -4, -5};
        assertEquals(-1, calculations.maximumUsingStream(negativeNums));
        assertEquals(-5, calculations.minimumUsingStream(negativeNums));
        assertEquals(-15, calculations.sumUsingStream(negativeNums));
        assertEquals(-3, calculations.averageUsingStream(negativeNums));
    }

    @Test
    void testMixedNumbers() {
        int[] mixedNums = {-1, 0, 1, 2, -2};
        assertEquals(2, calculations.maximumUsingStream(mixedNums));
        assertEquals(-2, calculations.minimumUsingStream(mixedNums));
        assertEquals(0, calculations.sumUsingStream(mixedNums));
        assertEquals(0, calculations.averageUsingStream(mixedNums));
    }

    @Test
    void testEvenNumbers() {
        int[] evenNums = {1, 2, 3, 4, 5, 6};
        int[] expectedEvens = {2, 4, 6};
        assertArrayEquals(expectedEvens, calculations.evenNumbersUsingStream(evenNums));
    }

    @Test
    void testOddNumbers() {
        int[] oddNums = {1, 2, 3, 4, 5, 6};
        int[] expectedOdds = {1, 3, 5};
        assertArrayEquals(expectedOdds, calculations.oddNumbersUsingStream(oddNums));
    }

    @Test
    void testAddFiveToEachElement() {
        int[] numsToAdd = {1, 2, 3};
        int[] expected = {6, 7, 8};
        assertArrayEquals(expected, calculations.addFiveToEachElementUsingStream(numsToAdd));
    }

    @Test
    void testSquareEachElement() {
        int[] numsToSquare = {1, 2, 3};
        int[] expected = {1, 4, 9};
        assertArrayEquals(expected, calculations.squareEachElementUsingStream(numsToSquare));
    }

    @Test
    void testLargeNumbers() {
        int[] largeNums = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        assertEquals(Integer.MAX_VALUE, calculations.maximumUsingStream(largeNums));
        assertEquals(Integer.MIN_VALUE, calculations.minimumUsingStream(largeNums));
        assertEquals(Integer.MAX_VALUE + Integer.MIN_VALUE, calculations.sumUsingStream(largeNums));
        assertEquals(0, calculations.averageUsingStream(largeNums));
    }

    @Test
    void testAllSameNumbers() {
        int[] sameNums = {7, 7, 7, 7};
        assertEquals(7, calculations.maximumUsingStream(sameNums));
        assertEquals(7, calculations.minimumUsingStream(sameNums));
        assertEquals(28, calculations.sumUsingStream(sameNums));
        assertEquals(7, calculations.averageUsingStream(sameNums));
    }

    @Test
    void testEvenNumbersWithEmptyArray() {
        int[] emptyArray = {};
        assertArrayEquals(new int[]{}, calculations.evenNumbersUsingStream(emptyArray));
    }

    @Test
    void testOddNumbersWithEmptyArray() {
        int[] emptyArray = {};
        assertArrayEquals(new int[]{}, calculations.oddNumbersUsingStream(emptyArray));
    }

    @Test
    void testAddFiveToEachElementWithEmptyArray() {
        int[] emptyArray = {};
        assertArrayEquals(new int[]{}, calculations.addFiveToEachElementUsingStream(emptyArray));
    }

    @Test
    void testSquareEachElementWithEmptyArray() {
        int[] emptyArray = {};
        assertArrayEquals(new int[]{}, calculations.squareEachElementUsingStream(emptyArray));
    }

    @Test
    void testAddFiveToEachElementWithSingleElement() {
        int[] singleNum = {42};
        assertArrayEquals(new int[]{47}, calculations.addFiveToEachElementUsingStream(singleNum));
    }

    @Test
    void testSquareEachElementWithSingleElement() {
        int[] singleNum = {42};
        assertArrayEquals(new int[]{1764}, calculations.squareEachElementUsingStream(singleNum));
    }

    @Test
    void testAddFiveToEachElementWithNegativeNumbers() {
        int[] negativeNums = {-1, -2, -3, -4, -5};
        int[] expected = {4, 3, 2, 1, 0};
        assertArrayEquals(expected, calculations.addFiveToEachElementUsingStream(negativeNums));
    }

    @Test
    void testSquareEachElementWithNegativeNumbers() {
        int[] negativeNums = {-1, -2, -3, -4, -5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, calculations.squareEachElementUsingStream(negativeNums));
    }

    @Test
    void testAddFiveToEachElementWithMixedNumbers() {
        int[] mixedNums = {-1, 0, 1, 2, -2};
        int[] expected = {4, 5, 6, 7, 3};
        assertArrayEquals(expected, calculations.addFiveToEachElementUsingStream(mixedNums));
    }

    @Test
    void testSquareEachElementWithMixedNumbers() {
        int[] mixedNums = {-1, 0, 1, 2, -2};
        int[] expected = {1, 0, 1, 4, 4};
        assertArrayEquals(expected, calculations.squareEachElementUsingStream(mixedNums));
    }

    @Test
    void testEvenNumbersWithSingleElement() {
        int[] singleNum = {42};
        assertArrayEquals(new int[]{42}, calculations.evenNumbersUsingStream(singleNum));

        int[] anotherSingleNum = {43};
        assertArrayEquals(new int[]{}, calculations.evenNumbersUsingStream(anotherSingleNum));
    }

    @Test
    void testOddNumbersWithSingleElement() {
        int[] singleNum = {43};
        assertArrayEquals(new int[]{43}, calculations.oddNumbersUsingStream(singleNum));

        int[] anotherSingleNum = {42};
        assertArrayEquals(new int[]{}, calculations.oddNumbersUsingStream(anotherSingleNum));
    }
}
