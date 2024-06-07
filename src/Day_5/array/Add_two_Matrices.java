package Day_5.array;

import java.util.Scanner;

public class Add_two_Matrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first matrices");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        // input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the element "+(i+1)+" : "+(j+1)+":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the size of the second matrices");
        int n1 = sc.nextInt();

        int arr1[][] = new int[n1][n1];

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                System.out.print("Enter the element "+(i+1)+" : "+(j+1)+":");
                arr1[i][j] = sc.nextInt();
            }
        }


        int arr3[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr3[i][j] = arr[i][j]+arr1[i][j];
            }
        }
        System.out.print("{");
        for(int a[] : arr3)
        {
            System.out.print("{");
            for(int ab : a)
            {
                System.out.print(ab+" ");
            }
            System.out.print("}");
        }
        System.out.print("}");

    }
}
