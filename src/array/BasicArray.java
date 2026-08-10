package array;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3,1,2,3,5,5};

        // traversing the array
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
        //System.out.println(sumOfArrayElements(arr, n));
        //System.out.println(countOfOddElement(arr, n));
       // System.out.println(checkSortedArray(arr, n));
       // reverseAnArray(arr, n);
       // System.out.println(differenceOfSum(arr));
        System.out.println(secondMostFrequentElement(arr));
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
    //Input: nums = [1,2,3,4]
    //Output: 0
    //Explanation:
    //The element sum of nums is 1 + 2 + 3 + 4 = 10.
    //The digit sum of nums is 1 + 2 + 3 + 4 = 10.
    //The absolute difference between the element sum and digit sum is |10 - 10| = 0.
    static int differenceOfSum(int[] nums){
        int elSum = 0, digitSum = 0;

        for (int i = 0; i < nums.length; i++){
            elSum += nums[i]; // sum of elements

            int num = nums[i];
            // sum of digits
            while (num > 0){
                int lastDigit = num % 10;
                digitSum += lastDigit;
                num = num / 10;
            }
        }
        return Math.abs(elSum - digitSum);
    }

    // Second highest occurring element
    // arr = [1,2,3,2,3,4,4,4]
    // output -> 2 (both 2 & 3 appear second mot times, 2 is smaller)
    static int secondMostFrequentElement(int[] nums){
        int maxFreq = 0, secMaxFreq = 0;
        int maxElement = -1, secMaxElement = -1;
        int[] visited = new int[100001];
        for (int i = 0; i < nums.length; i++) {
            if (visited[nums[i]] == 1) {
                continue;
            }
            int count = 0;
            visited[nums[i]] = 1;
            // count frequency
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxFreq) {
                secMaxFreq = maxFreq;
                maxFreq = count;
                secMaxElement = maxElement;
                maxElement = nums[i];
            } else if (count == maxFreq) {
                // Keep the smaller element as maxElement
                maxElement = Math.min(maxElement, nums[i]);
            } else if (count > secMaxFreq) {
                secMaxFreq = count;
                secMaxElement = nums[i];
            } else if (count == secMaxFreq) {
                secMaxElement = Math.min(secMaxElement, nums[i]);
            }
        }
        return secMaxElement;
    }
    }
