package com.sparta.dg;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unorderedArray = {2, 7, 3, 86, 12, 45, 0};
        System.out.println(Arrays.toString(ascendingBubbleSort(unorderedArray)));
    }

    public static int[] ascendingBubbleSort(int[] unorderedArray) {

        int length = unorderedArray.length;
        int[] orderedArray = Arrays.copyOf(unorderedArray, length);

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (orderedArray[j - 1] > orderedArray[j]) {
                    int temp = orderedArray[j - 1];
                    orderedArray[j - 1] = orderedArray[j];
                    orderedArray[j] = temp;
                }
            }
        }
        return orderedArray;
    }
}
