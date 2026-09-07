package array;

import java.util.*;

public class Array_III {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, // Row 0
                      {4, 5, 6}, // Row 1
                      {7, 8, 9}};
        // System.out.println(majorityElement(arr));
        //  System.out.println(leaders(arr));
      //  System.out.println(Arrays.toString(rearrangeArrayBySign(arr)));
       // System.out.println(Arrays.toString(twoSum(arr, 4)));

        System.out.println(spiralOrder(arr));
    }


    static int majorityElement(int[] nums) {
        int n = nums.length;

//        for (int i = 0; i < n; i++) {
//            int count = 0;
//
//            for (int j = 0; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//
//            if (count > n / 2) {
//                return nums[i];
//            }
//        }
//
//        return -1;
        // O(n^2) -> t.c

        // using hashmap

        HashMap<Integer, Integer> elementFreq = new HashMap<>();

        for (int i : nums) {
            elementFreq.put(i, elementFreq.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : elementFreq.entrySet()) {
            if (map.getValue() > n / 2) {
                return map.getKey();
            }
        }

        return -1;
    }

    // leaders in an array
    //Input: nums = [1, 2, 5, 3, 1, 2]
    //Output: [5, 3, 2] -> rightmost always a leader & element > all elements in its right

    static List<Integer> leaders(int[] nums) {
        int n = nums.length;
        int left = n - 2;
        int right = n - 1;
        List<Integer> leaderList = new ArrayList<>();
        leaderList.add(nums[n - 1]);
        while (left < right && left >= 0){

            if ( leaderList.get(leaderList.size() - 1) < nums[left]){
                leaderList.add(nums[left]);
            }
            left--;
            right--;

        }
        Collections.reverse(leaderList);
        return leaderList;
    }

    //Rearrange array elements by sign
    //Input : nums = [2, 4, 5, -1, -3, -4]
    //Output : [2, -1, 4, -3, 5, -4] , 1st element always positive

    static int[] rearrangeArrayBySign(int[] nums){
        int n = nums.length;
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        // separate positive and negative array
        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                positiveList.add(nums[i]);
            }else {
                negativeList.add(nums[i]);
            }
        }

        // positive at even and negative at odd
        for (int i = 0; i < n / 2; i++){
            nums[2*i] = positiveList.get(i);
            nums[2*i + 1] = negativeList.get(i);
        }

        return nums;
    }

    // Two sum
    // Input: nums = [1, 6, 2, 10, 3], target = 7
    //Output: [0, 1]
    static int[] twoSum(int[] nums, int target){

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // spiral order

    static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> spiralList = new ArrayList<>();

        // Number of rows
        int n = matrix.length;

        // Number of columns
        int m = matrix[0].length;

        // Initialize pointers for traversal
        int top = 0, left = 0;
        int bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; ++i) {
                spiralList.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; ++i) {
                spiralList.add(matrix[i][right]);
            }
            right--;


            if (top <= bottom) {
             for (int i = right; i >= left ; --i){
              spiralList.add(matrix[bottom][i]);
              }
              bottom--;
            }

            if (left <= right) {
             for (int i = bottom; i >= top; --i){
              spiralList.add(matrix[i][left]);
             }
            left++;
            }
        }

        return spiralList;
    }
}
