package Liveprojects.Bitwise;

public class LiveClass {
    public static void main(String[] args) {
        int num = 43;

        // left Shift
        System.out.println(num << 1);
        System.out.println(num << 2);
        // right shift
        int rightShiftNum = 10;
        System.out.println(rightShiftNum >> 1);
        // complement(1's complement)
//        int complementNum = 43;
//        System.out.println(~complementNum);

        // 2's complement(1's complement + 1)
        int complementNum = 43;
        System.out.println(~complementNum + 1);

        int compulsory4BitNum = 181;
        int ans = compulsory4bit1(compulsory4BitNum, 3);
        System.out.println(ans);

        int compulsory4BitNum1 = 181;
        int Ans = compulsory4bit0(compulsory4BitNum1, 4);
        System.out.println(Ans);

        int compulsary4bitFlipNum = 165;
        int flipAns = compulsary4bitFlip(compulsary4bitFlipNum,4);
        System.out.println(flipAns);

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
    mint: XOR.
     */

    public static int compulsary4bitFlip(int num, int position){
        int mask = 1 << position;
        return mask ^ num;
    }

}
