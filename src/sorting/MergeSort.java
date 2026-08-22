package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={5,3,6,2,4,8,1};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){

            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    static void mergeSortOperation(int[] arr, int low, int high){
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSortOperation(arr, low, mid);
        mergeSortOperation(arr, mid + 1, high);

        merge(arr, low ,mid, high);
    }

    static int[] mergeSort(int[] nums){
        int n = nums.length;

        mergeSortOperation(nums, 0, n-1);

        return nums;
    }
}
