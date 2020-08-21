package nowcoder.sort;

/**
 * 插入排序
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        int len = arr.length;
        int insert;
        for (int i = 0; i < len; i++) {
            insert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > insert) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insert;
        }
    }
}
