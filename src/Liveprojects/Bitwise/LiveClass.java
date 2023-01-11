package Liveprojects.Bitwise;

import java.util.ArrayList;

public class LiveClass {
    public static void main(String[] args) {
//        int num = 43;

        // left Shift
//        System.out.println(num << 1);
//        System.out.println(num << 2);
//        // right shift
//        int rightShiftNum = 10;
//        System.out.println(rightShiftNum >> 1);
        // complement(1's complement)
//        int complementNum = 43;
//        System.out.println(~complementNum);

        // 2's complement(1's complement + 1)
//        int complementNum = 43;
//        System.out.println(~complementNum + 1);
//
//        int compulsory4BitNum = 181;
//        int ans = compulsory4bit1(compulsory4BitNum, 3);
//        System.out.println(ans);
//
//        int compulsory4BitNum1 = 181;
//        int Ans = compulsory4bit0(compulsory4BitNum1, 4);
//        System.out.println(Ans);

//        int compulsary4bitFlipNum = 165;
//        int flipAns = compulsary4bitFlip(compulsary4bitFlipNum,4);
//        System.out.println(flipAns);

//        int rightMostBitNum = 684;
//        int rightMostBitAns = rightMostBit(rightMostBitNum);
//        System.out.println(rightMostBitAns);
//
//        int countSetBitNum = 7;
//        int countSetBitNumAns = countSetBits(countSetBitNum);
//        System.out.println(countSetBitNumAns);

//        int isPowerOfNum = 64;
//        int isPowerOf2NumAns = isPowerOf2(isPowerOfNum);
//        System.out.println(isPowerOf2NumAns);

        int EvenOrOddNum = 3;
        int EvenOrOddNumAns = EvenOrOdd(EvenOrOddNum);
        System.out.println(EvenOrOddNumAns);

        System.out.println("------------------------------------");

        int isPowerOf2Num = -2147483647;
        int isPowerOf2NumAns = isPowerOf2(isPowerOf2Num);
        System.out.println(isPowerOf2NumAns);

        int isPowerOf4Num = 16;
        boolean isPowerOf4NumAns = isPowerOf4(isPowerOf4Num);
        System.out.println(isPowerOf4NumAns);

        int grayCodeNum = 4;
        ArrayList<String> grayCodeAns = grayCode(grayCodeNum);
        System.out.println(grayCodeAns);

        int[] bitDifferenceOfAllPairarr = {23, 25,21};
        long bitDifferenceOfAllPairAns = bitDifferenceOfAllPair(bitDifferenceOfAllPairarr);
        System.out.println(bitDifferenceOfAllPairAns);

        int OneNonRepeatingNumArr[] = {2,3,5,7,5,7,3, 2, 99};
        int OneNonRepeatingNumAns = OneNonRepeating(OneNonRepeatingNumArr);
        System.out.println(OneNonRepeatingNumAns);

        int TwoNonRepeatingNumArr[] = {32, 56,56,50,50, 24,21,21} ;
//        int TwoNonRepeatingNumArr[] = {89, 56,56,50,50, 24,21,89} ;
        int TwoNonRepeatingNumAns[] = TwoNonRepeating(TwoNonRepeatingNumArr);
        System.out.println(TwoNonRepeatingNumAns[0]+ " " + TwoNonRepeatingNumAns[1]);


    }

    /*
    Question: we need to make sure that 4th bit is always(SET)
    Input: 181
    Output: 189
    Explanation: (SET) bit is always 1 and not 0.
     */
    public static int compulsory4bit1(int num, int position){
        int mask = 1 << position;
        return mask | num;
    }
    // Tc and sc = O(1).

    /*
    Question: we need to make sure that 4th bit is always(SET)
    Input: 181
    Output: 165
    Explanation: (un-SET) bit is always 0 and not 1.
    mint: AND
     */

    public static int compulsory4bit0(int num, int position){
        int mask = 1 << position;
        mask = ~mask;
        return mask & num;
    }

     /*
    Question: we need to make sure that 4th bit is always(SET)
    Input: 165
    Output: 181
    Explanation: At a position flip the bit(if 0 flip it to 1) and (if 1 flip it to 0).
    Hint: XOR.
     */

    public static int compulsary4bitFlip(int num, int position){
        int mask = 1 << position;
        return mask ^ num;
    }
     /*
    Question: Find the right most set Bit.
    Input: 684
    Output: 4
    Explanation:
    Hint: take 2's complement and do and operation
     */

    public static int rightMostBit(int num){
        int numComplement = ~num;
        int twosComplementOfNum = numComplement + 1;
        return num & twosComplementOfNum;
    }
     /*
        Question: Count the set Bit kernighan algo.
        Input: 2696
        Output: 4
        Explanation:
        HINT: find rightMostSetBit and subtract that with the original number till you get original no 0
     */

    public static int countSetBits(int num){
        int count = 0;
        while(num != 0){
            int rightMostSetBit = rightMostBit(num);
            if(rightMostSetBit != 0){
                count++;
            }
            num -= rightMostSetBit;
        }
        return count;
    }

     /*
    Question: Is power of 2.
    Input: 16
    Output: 0
    Explanation:
    Hint: find the n-1 and do & operation
     */

    public static int isPowerOf2(int num){
        if(num == 0){
            return 1;
        }

        return (num & num - 1);
    }
    // TC SC = O(1)

    public static boolean isPowerOf4(int num) {
//        we will check if the num is power of 2 or not
        boolean conditionForpowerOF2 = (num & num -1 ) == 0;

//        Mask = 01010101010101
        boolean conditionWithMAsk = (0x55555555 & num) != 0;
        return (num > 0 && conditionForpowerOF2  && conditionWithMAsk);
    }

    public static int EvenOrOdd(int num){

        return (num & num - 1);
    }

    /*
      Question: Find out one non-repeating element in repeating array.
      Input: [2,3,4,7,4,3,7]
      Output: 2
      Hint: Do xor for every element inside it.
     */
    public static int OneNonRepeating(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];

        }
        return ans;
    }

    /*
        Question: 2 elements non repeating rest of them are repeating
        Input: []
     */
    public static int[] TwoNonRepeating(int[] arr){
        int xorNum = 0;
        for (int i = 0; i < arr.length; i++) {
            xorNum ^= arr[i];

        }
        int rightMostSetBit = xorNum & -xorNum;

        int group1 = 0; // resembles the rightMostSetBit
        int group2 = 0; // doesNot resembles the right most bit

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if((val & rightMostSetBit) == 0){
                group1 ^= val;
            }else {
                group2 ^= val;
            }

        }
        return new int[]{group1, group2};
    }




    /*
    Question: gray code.....

     */

    public static ArrayList<String> grayCode(int n){
        // base case
        if(n==1){
            ArrayList<String> al = new ArrayList<>();
            al.add("0");
            al.add("1");
            return al;
        }
        // faith and work
        ArrayList<String> recursiveAns = grayCode(n-1);
        ArrayList<String> result = new ArrayList<>();

        // i want to add 0
        for (int i = 0; i < recursiveAns.size(); i++) {
            String item = recursiveAns.get(i);
            result.add("0" + item);

        }
        // i want to add 1
        for (int i = recursiveAns.size() - 1; i >=0; i--) {
            String item = recursiveAns.get(i);
            result.add("1" + item);
        }
        return result;

    }

    public static long bitDifferenceOfAllPair(int[] arr ){
        long result = 0;
        int MOD = 1000000007;

        for (int i = 0; i < 32; i++) {
            int countOn = 0;
            int mask = 1 << i;

            for (int j = 0; j < arr.length; j++) {
                if((mask & arr[j]) != 0){
                    countOn++;
                }

            }
            int countOff = arr.length - countOn;
            result = (result + countOn * countOff * 2)%MOD;

        }
        return result;

    }
//    TC = O(n*32)
//    sc = O(1)


}
