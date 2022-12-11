import java.util.Scanner;

//this is all about the 2d array
// declaration - 
//for the 2-D Arrays
// type[][]arrayName = new type[row][col]
public class lac29 {
    public static void main(String[] args) {
        System.out.println("input the number of rows and coloumn");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // System.out.println(rows);
        int[][] num = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter the " + i + "," + j + " element");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("enter the number which you want to find the position in you array");
        int a = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (num[i][j] == a) {
                    System.out.println("the position of the number " + a + " in array is (" + i+"," + j+")");
                }

            }
        }
    }
}
