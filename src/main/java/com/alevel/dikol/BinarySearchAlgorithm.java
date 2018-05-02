package com.alevel.lecture2;

/**
 * TODO
 */
class BinarySearchAlgorithm {

    static boolean find(int needle, int[] stack) {
      int length = stack.length;
       for (int j = 0; j < length - 1; j++) {
          stack = swapNumbers (stack[], j);
       }
        for (int i = 0; i <length ; i++) {
          System.out.print(stack[i]);

        }
        public static int[] swapNumbers (int[] stack, int limit) {
            for (int i = 0; i < stack.length - limit -1 ; i++) {
                if (stack[i] > stack[i +1]) {
                    int temp = stack[i];
                    stack[i] = stack[i +1];
                    stack[i +1] = temp;

                }
            }
            return stack;
        }
        int v = -1;
        int low = 0, max = stack.length, mid;
       while (low < max){
           mid = (low+max)/2;
           if (needle == stack[mid]){
                   return true;
               break;
           }else{
               if (needle < stack[mid]){
                       max = mid;
               }else{
                   low = mid + 1;
               }
           }
       }
       return v;





        // Здесь вам необходимо реализовать алгоритм бинарного поиска.
        // Ваша задача найти число needle в массиве чисел stack.
        // Если ваш алгоритм нашел искомое число, он должен выполнить такой код:
        //      return true;
        // похожий, на строку "return false", которую вы видите в конце метода.
        //
        // Переменные needle и stack уже объявлены и заполнены значениями.
        return false;
    }
}
