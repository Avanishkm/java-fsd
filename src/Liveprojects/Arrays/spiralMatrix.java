package Liveprojects.Arrays;

import java.util.Scanner;

public class spiralMatrix {
    static void spiralPrint(int m, int n, int[][] arr){
        int k=0, l=0;
        while(k<m && l<n){
            for (int i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");

            }
            k++;
            for (int i = k; i < m; i++) {
                System.out.print(arr[i][n-1] + " ");

            }
            n--;
            if(k<m){
                for (int i = n-1; i >=l ; i--) {
                    System.out.print(arr[m-1][i]+ " ");

                }
                m--;
            }
            if(l<n){
                for (int i = m-1; i >=k ; i--) {
                    System.out.print(arr[i][l] + " ");

                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

//        int[][] arr =  { { 10, 20, 30, 40, 50, 60 }, { 70, 80, 90, 100, 110, 120 }, { 130, 140, 150, 160, 170, 180 } };
        spiralPrint(row,col,arr);
    }
}
