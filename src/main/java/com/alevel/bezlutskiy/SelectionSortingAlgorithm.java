package com.alevel.bezlutskiy;

import com.alevel.lecture3.SortingAlgorithm;

import java.util.Arrays;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {
        /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < source.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = source[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < source.length; j++) {
                //Если находим, запоминаем его индекс
                if (source[j] < min) {
                    min = source[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = source[i];
                source[i] = source[min_i];
                source[min_i] = tmp;
            }
        }
        return source;
    }
}