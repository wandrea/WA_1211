package hu.helix.WA.WA_1206;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 6, 0};

     // bubbleSort(array);
        bubbleSortMin(array);


       for (int i = 0; i < array.length; i++) {

           System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int change = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = change;
                }
            }

        }

    }

    public static void bubbleSortMin(int[] array) {
        for (int i = array.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int change = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = change;
                }
            }

        }

    }




}
