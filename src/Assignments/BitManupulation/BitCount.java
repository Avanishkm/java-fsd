package Assignments.BitManupulation;

import java.util.Scanner;

public class BitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countSetBit(n));
    }
    public static int countSetBit(long num){
        int count = 0;
        while(num != 0){
            long rightMostSetBit = rightMostSetBit(num);
            if(rightMostSetBit != 0){
                count++;
            }
            num -= rightMostSetBit;
        }
        return count;
    }
    public static long rightMostSetBit(long num){
        long numComplement = ~num;
        long twosComplementOfNum = numComplement + 1;
        return num & twosComplementOfNum;
    }
}
