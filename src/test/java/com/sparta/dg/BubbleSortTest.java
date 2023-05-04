package com.sparta.dg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("If an empty array is passed...")
    void checkForEmptyArray() {
        int[] emptyArray = {};
        int[] returnedArray = {};
        Assertions.assertArrayEquals(returnedArray,BubbleSort.ascendingBubbleSort(emptyArray));
    }

    @Test
    @DisplayName("If an array with a single number is passed returns the same array")
    void checkForArrayOfLengthOne() {
        int[] inputArray = {1};
        int[] returnedArray = {1};
        Assertions.assertArrayEquals(returnedArray, BubbleSort.ascendingBubbleSort(inputArray));
    }

    @Test
    @DisplayName("If an array of length longer than one is passed, array or ascending ints returned")
    void checkForArrayLengthLongerThanOne() {
        int[] unorderedArray1 = {2,4,6,5,1,3};
        int[] unorderedArray2 = {264,34,0,123,2};
        int[] unorderedArray3 = {1,456,23,7,99,4,5};

        int[] sortedArray1 = {1,2,3,4,5,6};
        int[] sortedArray2 = {0,2,34,123,264};
        int[] sortedArray3 = {1,4,5,7,23,99,456};

        Assertions.assertArrayEquals(sortedArray1, BubbleSort.ascendingBubbleSort(unorderedArray1));
        Assertions.assertArrayEquals(sortedArray2, BubbleSort.ascendingBubbleSort(unorderedArray2));
        Assertions.assertArrayEquals(sortedArray3, BubbleSort.ascendingBubbleSort(unorderedArray3));
    }

    @Test
    @DisplayName("If an array of negative numbers is passed an array in ascending order is returned")
    void checkForSortingAnArrayOfNegativeInts() {
        int[] unorderedArray = {-4,-3,-7,-6,-1,-9,-2,-10,-5,-8};
        int[] sortedArray = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        Assertions.assertArrayEquals(sortedArray, BubbleSort.ascendingBubbleSort(unorderedArray));
    }

    @Test
    @DisplayName("If an array of positive and negative ints is passed an array in ascending order is returned")
    void checkForSortingAnArrayOfPositiveAndNegativeInts() {
        int[] unorderedArray = {-1,7,4,23,-13,-12,9,0};
        int[] sortedArray = {-13,-12,-1,0,4,7,9,23};
        Assertions.assertArrayEquals(sortedArray, BubbleSort.ascendingBubbleSort(unorderedArray));
    }
}
