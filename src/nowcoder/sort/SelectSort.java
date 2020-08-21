package nowcoder.sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int temp = arr[i];
            int position = i;
            for (int j = i + 1; j < len; j++) {
                //找到最小值及其位置
                if (arr[j] < temp) {
                    temp = arr[j];
                    position = j;
                }
            }
            //将最小的数与当前值交换
            arr[position] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] sort = {1, 4, 5, 2, 3, 6, 0};
        selectSort(sort);
        for (int j : sort) {
            System.out.println(j);
        }
    }
}
