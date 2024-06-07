package Day_5.array;

import java.util.Scanner;

public class Find_the_Normal_and_Trace_of_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        // Array Input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the element "+(i+1)+":");
                arr[i][j] = sc.nextInt();
            }
        }

        //Normal matrix
        int Normal=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Normal+=(arr[i][j]*arr[i][j]);
            }
        }
        System.out.println("Normal="+Math.sqrt(Normal));


        //Trace Matrix
        int trace =0;
        int i=0,j=0;
        while(i<n && j<n)
        {
            trace+=arr[i][j];
            i++;
            j++;
        }
        System.out.println("Trace="+trace);

    }
}
