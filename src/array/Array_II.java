package array;

import java.util.Arrays;

public class Array_II {

    public static void main(String[] args) {
        int[] arr = {0,0,1,3,5,5};
       // shiftZerosToEnd(arr);

//        rotateArray(arr, 2);
//        for (int nums: arr){
//            System.out.print(nums+ " ");
//        }

       // System.out.println(missingNumber(arr));
        System.out.println(removeDuplicates(arr));
    }

    static void shiftZerosToEnd(int[] nums){

        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++ ){

            if (nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

    // rotate array by k places
    // arr = {1,2,3,4,5}, k = 2 -> o/p = {3,4,5,1,2}

    static void rotateArray(int[] nums, int k){
        int n = nums.length;
        k = k % n;

        // reverse first k elements
        reverseArray(nums, 0, k-1);

        // reverse n-k to n
        reverseArray(nums, k, n-1);

        // reverse entire array
        reverseArray(nums, 0, n-1);

        // t.c -> o(n) , s.c -> O(1)
    }

    // reverse an array
    static private void reverseArray(int[] nums, int start, int end){

        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }


    // find missing number in an array
    // arr = {0,1,2,3,5}, o/p = 4 , 0 to n = 5

    static int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = (n*(n+1)) / 2;
        int arraySum = 0;

        for (int i = 0; i < n; i++){

            arraySum += nums[i];
        }

        return sum - arraySum;
    }

    // Remove Duplicates from Sorted Array and return number of unique element
    // arr = {1,1,2,4,5,5} -> o/p = {1,2,4,5,_,_}
    // using two pointer
    // T.c -> O(n), s.c -> O(1)
    static int removeDuplicates(int[] nums){

        int left = 0;
        for (int right = 1; right < nums.length; right++){

            if (nums[left] != nums[right] ){
                left++;

                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}

