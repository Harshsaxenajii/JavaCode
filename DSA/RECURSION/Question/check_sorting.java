
public class check_sorting {
    public static int status = 0;

    public static void check_sort(int arr[], int i) {
        if (status != 0 || i == arr.length-1) {
            if (status == 0) {
                System.out.println("array is sorted");
            } else {
                System.out.println("array is not sorted");
            }
            return;
        }

        if (arr[i] > arr[i + 1]) {
            status = status + 1;
        } else {
            status = 0;
        }
        check_sort(arr, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        check_sort(arr, 0);

    }

}