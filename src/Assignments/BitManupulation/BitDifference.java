package Assignments.BitManupulation;

import java.util.Scanner;

public class BitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(bitDifferenceOfAllPairs(arr));
    }
    public static long bitDifferenceOfAllPairs(int[] arr){
        long ans = 0;
        int MOD = 1000000007;

        for (int i = 0; i < 32; i++) {
            long countOn = 0;
            int mask = 1 << i;

            for (int j = 0; j < arr.length; j++) {
                if((mask & arr[j]) != 0){
                    countOn++;
                }

            }
            long countOff = arr.length - countOn;
            ans = (ans + countOn * countOff * 2)%MOD;

        }
        return ans;
    }
}
