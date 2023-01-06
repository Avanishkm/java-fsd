package Liveprojects.Arrays;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][4];

        int rowLength = array.length;
        int colLength = array[0].length;

    }
    public static int[] PrefixSumArray(int[] arr){
        int[] prefixSumArr = new int[arr.length];
        prefixSumArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSumArr[i] = prefixSumArr[i-1] + arr[i];


        }
        return prefixSumArr;
    }
}
