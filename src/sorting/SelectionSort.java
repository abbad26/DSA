package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,2,1,3,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }


    // selection sort
    // arr = {5,2,6,3} -> in 1st iteration minimum will be shifted to 1st right -> {2,5,6,3}  2 is sorted
    static int[] selectionSort(int[] nums){
        int n = nums.length;

        for (int i =0; i < n-1; i++){
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {

                    minIndex = j;
                }
            }
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
        }
        return nums;
    }

    // bubble sort
    // push the max to the last by adjacent swap
    // t.c -> O(n^2) worst , best O(n)
    static int[] bubbleSort(int[] nums){
        int n = nums.length;

        for (int i = n-1; i >= 0; i--){
            boolean swap = false; // if array is already sorted then it will not go to the next iteration
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swap = true;
                }
            }

            if (!swap){
                break;
            }
        }
        return nums;
    }
}
