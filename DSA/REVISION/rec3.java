public class rec3 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 3, 7, 34, 26 };

        // this is the bubble sort
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             // swap
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        //this is the selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = 1+i; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    //swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //this is the insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            //shorted part
            int j = i-1;
            while (j>=0 && arr[j]>current) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }

        printArr(arr);
    }
}
