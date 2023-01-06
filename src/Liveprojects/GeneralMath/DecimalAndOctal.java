package Liveprojects.GeneralMath;

public class DecimalAndOctal {
    public static void main(String[] args) {
//        int n = 11;
//        String ansOctal = decimalToOctal(n);
//        System.out.println(ansOctal);
        int octaN = 11;
        int decimalAns = octalToDecimal(octaN);
        System.out.println(decimalAns);

    }
    public static String decimalToOctal(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int remainder = n % 8;
            n = n / 8;
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }

    public static int octalToDecimal(int n){
//        int n = 101
        int power = 0;
        int decimalNumber = 0;
        while(n>0){
            int remainder = n % 10;
            n = n / 10;
            decimalNumber += remainder * Math.pow(8, power);
        }
        return decimalNumber;
    }
}
