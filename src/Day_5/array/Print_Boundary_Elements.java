package Day_5.array;

import java.util.Scanner;

public class Print_Boundary_Elements {
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
                System.out.print("Enter the element "+(i+1)+" , "+(j+1)+":");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==0 || j==0 || i==n-1 || j==n-1)
                   System.out.print(arr[i][j]+" ");
               else
                   System.out.print("  ");
            }
            System.out.println();
        }



    }
}
