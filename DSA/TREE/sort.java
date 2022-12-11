public class sort {
    public static void sort012(int a[], int n) {
        for (int j = 0; j < a.length; j++) {

            for (int i = 0; i < n - 1; i++) {

                if (a[i] > a[i + 1]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 0, 2, 1, 2, 0 };
        sort012(arr, N);
    }
}
