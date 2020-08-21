package nowcoder.sort;

import java.util.Objects;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return null;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //把最小的移到最左边
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sort = {1, 4, 2, 5, 7};
        for (int i = 0; i < sort.length; i++) {
            System.out.println(Objects.requireNonNull(bubbleSort(sort))[i]);
        }
    }
}
