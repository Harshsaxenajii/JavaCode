// good question

public class rotate {
    public static void rotate(int arr[], int n) {
        // int a = arr[n];
        // for (int i = 0; i < n-1; i++) {
        // arr[i] = arr[i+1];
        // }
        // arr[0] = a;

        // int x = arr[arr.length-1], i;
        // for (i = arr.length-1; i > 0; i--)
        // arr[i] = arr[i-1];
        // arr[0] = x;

        // for loop in different way -- we cant tervers left to right due to last
        // element is not swap easily
        // for (int i = 0; i < arr.length-1; i++) {
        // arr[i+1] = arr[i];
        // }

        int a = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 6, 7, 9 };
        rotate(arr, arr.length);
        System.out.println();
        rotate(arr, arr.length);
        System.out.println();
        rotate(arr, arr.length);
    }
}

