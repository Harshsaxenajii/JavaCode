public class findmixmax {
    public static void printMaxMin(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("the max element in array is: "+max +" and min is: "+ min);
    }
    public static void main(String[] args) {
        int arr[] = {45,23,67,43,12,87};
        printMaxMin(arr);        
    }
}
