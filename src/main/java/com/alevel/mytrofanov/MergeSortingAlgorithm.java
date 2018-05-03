package com.alevel.lecture3;

/**
 * The merge sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        // Здесь необходимо реализовать сортировку слиянием.
        int left = 0;
        int right = source.length - 1;
        sorting(source, left, right);
//        System.out.println("This is a Merge Sort: ");
//        Lecture3.printArray(source);
        return source;
        //return new int[0];
    }

    void sorting(int[] source, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            sorting(source, left, mid);
            sorting(source, mid + 1, right);
            // Merge the sorted halves
            merge(source, left, mid, right);
        }
    }

    void merge(int arr[], int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
