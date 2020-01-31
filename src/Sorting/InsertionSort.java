package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {12, 3, 4, 7, 6, 5, 4, 0};
        int len = array.length;
        int temp, i, j;
        for(i = 1; i < len; i++){
            temp = array[i];
            for(j = i-1; j >= 0; j--){
                if(array[j] > temp){
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j + 1] = temp;
        }

        for(i = 0; i < len; i++){
            System.out.println(array[i]);
        }
    }
}
