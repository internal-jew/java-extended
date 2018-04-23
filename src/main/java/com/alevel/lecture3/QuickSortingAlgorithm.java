package com.alevel.lecture3;

/**
 * The quick sort algorithm.
 */
public class QuickSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        quickSort(source, 0, source.length - 1);
        return source;
    }

    public static void quickSort(int[] source, int low, int high) {
        if (source.length == 0) {//если длинна масива равна нулю то выходим из метода
            return;
        }

        if (low >= high) {//если нечего делить то выходим из метода
            return;
        }

        //выбираем опорный элемент - середина масива
        int currentMiddle = low + (high - low) / 2;
        int opora = source[currentMiddle];

        //разделяем на подмосивы - большая и меньшая часть от опорного элемента
        int currentLow = low, currentHigh = high;
        while (currentLow <= currentHigh) {
            while (source[currentLow] < opora) {
                currentLow++;
            }
            while (source[currentHigh] > opora) {
                currentHigh--;
            }

            //меняем местами левый и правый элемент от опорного
            if (currentLow <= currentHigh) {
                int buffer = source[currentLow];
                source[currentLow] = source[currentHigh];
                source[currentHigh] = buffer;
                currentLow++;
                currentHigh--;
            }
        }

        //рекурсией сортируем левую и правую часть
        if (low < currentHigh) {
            quickSort(source, low, currentHigh);
        }
        if (high > currentLow) {
            quickSort(source, currentLow, high);
        }
    }
}
/*
PS. Эта сортировка показалась мне интереснее, на сортировку слиянием не хватило времени :)
 */