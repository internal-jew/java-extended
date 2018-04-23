package com.alevel.lecture3;

/**
 * The selection sort algorithm.
 */
public class SelectionSortingAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] source) {

        int currentNumberOFArray = 0;//переменная хранящяя индекс элемента в масиве который оказолся меньше текущего
        int buffer;


        for (int i = 0; i < source.length; i++) {//цыкл проходит столько раз сколько элементов масиве

            int min = source[i];//задаем текущее минимальное число в масиве
            boolean isNeedToSwap = false;//нужно ли свапать в конце цыкла
            //идем по масиву оставшихся не отсортированых элементов
            for (int j = i; j < source.length; j++) {
                if (source[j] < min) {//если найдено число меньше текущего минимального то:
                    isNeedToSwap = true;//свапать нужно
                    min = source[j];//найденое число становиться текущим минимальным
                    currentNumberOFArray = j;//запоминаем индекс этого числа для дальнейшего свапа
                }
            }
            //если свапать нужно(найдено число меньше текущего минимального) то меняем местами элементы
            if (isNeedToSwap) {
                buffer = source[i];
                source[i] = min;
                source[currentNumberOFArray] = buffer;
            }
        }
        return source;
    }
}