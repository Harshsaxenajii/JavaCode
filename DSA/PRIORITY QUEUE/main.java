
public class main {
    public static int[] delete(int arr[], int index) {
        if (arr==null||arr.length<index||index<0) {
            return arr;
        }
        int newArr[] = new int[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            else{
                newArr[j++] = arr[i];
            }
        }
        print(newArr);
        return newArr;
        
    }

    public static void print(int arr[]) {

        // for print the element of arr
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(arr.length);
        // linear search
        int a = 5;

        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println(i);
            }
        }

        // binary search
        if (arr[arr.length / 2] < a) {
            for (int i = arr.length / 2; i < arr.length; i++) {
                if (arr[i] == a) {
                    System.out.println("found at: " + i);
                }
            }

        }
        if (arr[arr.length / 2] > a) {
            for (int i = arr.length / 2; i >= 0; i--) {
                if (arr[i] == a) {
                    System.out.println("found at: " + i);
                }
            }

        }
        if (arr[arr.length / 2] == a) {
            System.out.println("found at: " + arr.length / 2);
        }

        // for update the value of arr
        // arr[1] = 6;

        // deleting the element
        delete(arr, a); 
        // print the arr
        // print(arr);
    }

}