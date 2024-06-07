package Day_5.array;

import java.util.Scanner;

public class Sum_of_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("enter the element " +(i+1)+ (j + 1) + " ");
                arr[i][j] = sc.nextInt();
            }
        }
        //Principal Diagonal
        int sum = 0;
       int i=0,j=0;
       while(i<n && j<n){
           sum += arr[i][j];
           i++;
           j++;
       }
       System.out.println("The Principal diagonals is "+sum);


        //Secondary Diagonal
        int sum1 = 0;
        int k=0,l=n-1;
        while(k<n && l>=0){
            sum1 += arr[k][l];
            k++;
            l--;
        }
        System.out.print("The Secondary diagonals is "+sum1);
    }
}
