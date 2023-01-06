package Liveprojects.GeneralMath;

public class DecimalAndBinary {
    public static void main(String[] args) {
        int num = 10;
//        String ans = decimalToBinary(num);
//        System.out.println(ans);
        int binaryNum = 10001;
        int DecimalAns = binaryToDecimal(binaryNum);
        System.out.println(DecimalAns);

    }

    /*
      Question: Conversion Decimal number to binary
      input: 5
      output: 1 0 1
     */
    public static String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            num /= 2;
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }

    public static int binaryToDecimal(int num) {
        int power = 0;
        int decimalNumber = 0;

        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, power);
            power++;
        }
        return decimalNumber;

    }
}
