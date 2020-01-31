package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {12, 3, 4, 7, 6, 5, 4, 0};
        int len = array.length;
        int temp, i, j;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }
}
