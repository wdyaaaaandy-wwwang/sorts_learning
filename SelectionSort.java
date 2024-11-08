import java.util.Arrays;

/**
 * @author Andy_Wang
 * @version 1.0
 * @description: 选择排序
 * @date 2024/11/8 11:25
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // 交换 arr[min_idx] 和 arr[i]
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
