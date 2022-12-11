//this is all about the sorting
// 1-bubble sorting
// 2-selection sorting
// 3-insertion sorting
public class lac1 {

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };
        // time complexity = O(n^2)
        // bubble sort
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap element if greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

}