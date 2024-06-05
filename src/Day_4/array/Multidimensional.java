package Day_4.array;

import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("Enter the element "+(i+1)+":" + (j+1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int a[] :arr)
        {
            for(int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
