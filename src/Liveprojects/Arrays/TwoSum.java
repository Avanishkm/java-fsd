package Liveprojects.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
    public static int[] printSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j< arr.length; j++){
                if(target == arr[i] + arr[j]){
                    return new int[] {i, j};

                }
            }
        }
        return null;
    }

    public static void countDuplicate(int[] arr){
        int count = 1;
        for(int i =0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]== arr[j]) {
                    count++;
                }else{
                    break;
                }
                if(count>1){
                    System.out.println(arr[i] + " "+ count);
                    

                }

            }
        }

    }

}



/// mock interviews questions asked by interviewer

//public class Main
//{
//    public static void main(String[] args){
//        // Scanner sc = new Scanner(System.in);
//        int n = 101;
//        int sum = 0;
//        int temp = n;
//        while(n>0){
//            int rem = n%10;
//            sum = (sum * 10) + rem;
//            n = n/10;
//
//        }
//        if(temp == sum){
//            System.out.println("number is palindrome");
//
//        }else{
//            System.out.println("number is not palindrom");
//        }
//
//    }





// 	public static void main(String[] args) {
// 	   // Scanner sc = new Scanner(System.in);
// 	    int n = 10;
// 	    int counter = 0;
// 	    for (int i = 2; i<n; i++){
// 	        if(n%i == 0){
// 	            counter++;
// 	            break;
// 	        }
// 	    }
// 	    if(counter ==0){
// 	        System.out.println("Prime number ");
// 	    }else{
// 	        System.out.println("not prime number");
// 	    }



// 	}

//}
