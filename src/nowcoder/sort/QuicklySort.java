package nowcoder.sort;

/**
 * 快速排序
 */
public class QuicklySort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int base = arr[start];//基准值，比他大的放左边  比他小的放右边
            int mid;//中间值
            int i = start;
            int j = end;
            while (i < j) {
                while (arr[i] < base && i < end)
                    i++;
                while (arr[j] > base && j > start)
                    j--;
                if (i <= j) {
                    mid = arr[i];
                    arr[i] = arr[j];
                    arr[j] = mid;
                    i++;
                    j--;
                }
            }
            if (start < j)
                quickSort(arr, start, j);
            if (i < end)
                quickSort(arr, i, end);
        }
    }

    public static void main(String[] args) {
        int[] sort = {1, 4, 5, 2, 3, 6, 0};
        quickSort(sort, 0, sort.length - 1);
        for (int i : sort) {
            System.out.println(i);
        }
    }

}
