package com.company;

public class BullAndCow {
    public int[] checkCowAndBull(int[] arr1, int[] arr2) {

        int[] arr = new int[2];
        int cow = 0;
        int bull = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (arr2[i] == arr1[j]) {
                    if (i == j) bull++;
                    else cow++;
                }
            }
        }
        arr[0] = cow;
        arr[1] = bull;
        return arr;
    }
}
