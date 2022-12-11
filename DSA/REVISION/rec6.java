public class rec6 {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,43,32,65,77,34,56};
        

        //this is the insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            //this is the sortest part
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