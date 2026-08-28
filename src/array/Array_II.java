package array;

import java.util.Arrays;

public class Array_II {

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3};
        shiftZerosToEnd(arr);
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



}

