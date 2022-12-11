public class rec1 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 2, 4, 32 };

        // this is the bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // this is the selection sort
        for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
        for (int j = i + 1; j < arr.length; j++) {
        if (arr[smallest] > arr[j]) {
        smallest = j;
        }

        // this is the insertion sort
        // for (int i = 1; i < arr.length; i++) {
        // int current = arr[i];
        // // this is sorted part
        // int j = i - 1;
        // while (j >= 0 && current < arr[j]) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // // placement
        // arr[j + 1] = current;

        // }

        // }
        // // swap smallest and the j
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }
        // }

        // this is the bubble sort again
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swap
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }

        // }
        // }

        // this is again the selection sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // int smallest = i;
        // for (int j = 1 + i; j < arr.length; j++) {
        // if (arr[smallest] > arr[j]) {
        // smallest = j;
        // }
        // }
        // // swap the both
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        // this is again a insertion sort
        // for (int i = 1; i < arr.length; i++) {
        // int current = arr[i];
        // // this is a sorted part
        // int j = i - 1;
        // while (j >= 0 && current < arr[j]) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // // placement
        // arr[j + 1] = current;

        // }
        printArr(arr);

    }

}