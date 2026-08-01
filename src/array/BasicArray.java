package array;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1,2,7,5};

        // traversing the array
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
        //System.out.println(sumOfArrayElements(arr, n));
        //System.out.println(countOfOddElement(arr, n));
       // System.out.println(checkSortedArray(arr, n));
        reverseAnArray(arr, n);
    }

    static int sumOfArrayElements(int arr[], int n){
        int sum = 0;

        for (int i = 0; i < n; i++){

            sum = sum + arr[i];
        }
        return sum;
    }
    static int countOfOddElement(int arr[], int n){
        int count = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] % 2 != 0) count++;
        }
        return count;
    }


    // Reverse Array
    // arr[] = {1,2,3} -> {3,2,1}
    static void reverseAnArray(int arr[], int n){

       // int[] temp = new int[n];

//        for (int i = 0; i < n; i++){
//            temp[n - i - 1] = arr[i];
//        }
//        for (int i = 0; i < n; i++){
//            arr[i] = temp[i];
//            System.out.print(arr[i] + " ");
//
//        }
        // T.C -> O(n), S.C -> O(n)

        // optimized code
        /*
            {1,2,3} -> left[0],right[n-1] swap left to right until they collide then stop
            Two-Pointer approach
         */
        int left = 0 , right = n - 1;

        while (left < right) {

            // Swap the elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

      // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // T.C -> O(n), S.C -> O(1)

    }

    // print array elements
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean checkSortedArray(int arr[], int n){

        for (int i = 0; i < n-1; i++){
            // T.c -> O(n*n)
//            for (int j = i +1; j < n; j++) {
//                if (arr[i] > arr[j]) {
//                    return false;
//                }
//            }

            // Optimized to O(n)
            if (arr[i] > arr[i + 1]) {
                    return false;
                }

        }
        return true;
    }
}
