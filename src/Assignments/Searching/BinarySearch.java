package Assignments.Searching;

public class BinarySearch {
    public static void main(String[] args) {


// Given a sorted array you need to find first and last occurence (index) of given element
// the function should return the array of length two, if no element exist return the index == -1;
        int arr[] = {4, 16, 18, 21, 23, 34, 34, 34, 34, 42, 67};
        // target => 34 firstIndex = 5, lastIndex = 8 [5,8];
        int first = -1;
        int last = -1;
        int target = 34;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){

            }
            if(first == -1){
                first = i;
            } else if (first != -1) {
                last = i;

            }
        if (first!=-1 && last == -1) {
            last = first;

            }
//        return [first, last];

        }
    }

}
