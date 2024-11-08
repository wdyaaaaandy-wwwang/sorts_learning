import java.util.Arrays;

/**
 * @author Andy_Wang
 * @version 1.0
 * @description: 冒泡排序实例  时间复杂度O(n^2)
 * @date 2024/11/8 11:14
 */
public class Bubblesorts {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
