package com.alevel.lecture3;

import java.util.Arrays;

/**
 * The quick sort algorithm.
 */
public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        int[] arr = {2,4,6,8,1,3,5,7};

        int pilot = arr[arr.length - 1];
        for (int i = 0; i < arr.length * 300; i++) {
            int wall = 0;

            if (arr[i] < arr[wall]) {
                wall = i;
            }



            for (int j = 0; j - 1 < pilot; j++) {
                int celem = arr[i];

                if (arr[i] < pilot) {
                    int temp = celem;
                    arr[wall] = celem;
                    arr[wall + 1] = temp;
                    arr[wall + 1] = arr[pilot];
                } else {
                    arr[wall + 1] = celem;
                    arr[wall + 1] = arr[pilot];
                }
            }

            System.out.println(Arrays.toString(arr));
        }

        return new int[0];
    }
}
