public class rec5 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,44,22,65,34,78,99,98};

        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[smallest];
                    arr[smallest] = temp;
                }
            }
        }

        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            //this is the sorted part
            int j = i-1;
            while (arr[j]>current) {
                arr[j+1] = arr[j]; 
            }
            //placement
            arr[j+1] = current;
        }
        printArr(arr);
    }

}