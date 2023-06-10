package yanghgri.datastructuresandalgorithms.algorithms;

import org.springframework.stereotype.Component;

@Component
public class Sorter {
    public int[] bubble(int[] array) {
        int unsortedUntilIndex = array.length - 1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            unsortedUntilIndex -= 1;
        }
        return array;
    }

    public int[] selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int lowestNumberIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[lowestNumberIndex] > array[j]) {
                    lowestNumberIndex = j;
                }
            }
            if (lowestNumberIndex != i) {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }
        return array;
    }
}