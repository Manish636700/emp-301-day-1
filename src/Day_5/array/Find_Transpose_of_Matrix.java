package Day_5.array;

import java.util.Scanner;

public class Find_Transpose_of_Matrix {
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

        for(int a[] : arr)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
            }
        }

        for(int a[] : arr)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
