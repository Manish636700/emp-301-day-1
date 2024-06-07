package Day_5.array;

import java.util.Scanner;

public class Interchange_Elements_of_First_and_Last_in_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) {
                System.out.print("Enter the elements of the array " + (i + 1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<n;j++) {
            int t = arr[0][j];
            arr[0][j]=arr[n-1][j];
            arr[n-1][j]=t;

        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
