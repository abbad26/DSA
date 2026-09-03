package array;

import java.util.*;

public class Array_II {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 2};
        int[] arr1 = {-45, -30, 4};
        // shiftZerosToEnd(arr);

//        rotateArray(arr, 2);
//        for (int nums: arr){
//            System.out.print(nums+ " ");
//        }

        //   System.out.println(missingNumber(arr));
        //  System.out.println(removeDuplicates(arr));
        //    System.out.println(Arrays.toString(unionOfArray(arr, arr1)));
        //   System.out.println(Arrays.toString(intersectionOfArray(arr, arr1)));

        // System.out.println(majorityElement(arr));
        System.out.println(leaders(arr));
    }

    static void shiftZerosToEnd(int[] nums) {

        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] != 0) {
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

    static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // reverse first k elements
        reverseArray(nums, 0, k - 1);

        // reverse n-k to n
        reverseArray(nums, k, n - 1);

        // reverse entire array
        reverseArray(nums, 0, n - 1);

        // t.c -> o(n) , s.c -> O(1)
    }

    // reverse an array
    static private void reverseArray(int[] nums, int start, int end) {

        while (start < end) {
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

        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != i) {
                return i;
            }
//            arraySum += nums[i];
        }

        return -1;
    }


    // Remove Duplicates from Sorted Array and return number of unique element
    // arr = {1,1,2,4,5,5} -> o/p = {1,2,4,5,_,_}
    // using two pointer
    // T.c -> O(n), s.c -> O(1)
    static int removeDuplicates(int[] nums) {

        int left = 0;
        for (int right = 1; right < nums.length; right++) {

            if (nums[left] != nums[right]) {
                left++;

                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

    // union of two array
    static int[] unionArray(int[] nums1, int[] nums2) {

        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }
        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set) {
            union[index++] = num;
        }
        return union;
    }

    // Union of array
    // two pointer approach

    // t.c -> O(n+m) <- s.c
    static int[] unionOfArray(int[] nums1, int[] nums2) {

        List<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while (i < n && j < m) {

            if (nums1[i] <= nums1[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }
                i++;
            } else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                    unionList.add(nums2[j]);
                }
                j++;
            }

        }

        while (i < n) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                unionList.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                unionList.add(nums2[j]);
            }
            j++;
        }

        int[] union = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) {
            union[k] = unionList.get(k);
        }
        return union;
    }


    // Intersection of tow non-decreasing array
    // Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
    // Output: [1, 2]

    static int[] intersectionOfArray(int[] nums1, int[] nums2) {

        List<Integer> intersectionList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                if (nums1[i] == nums2[j]) {
                    intersectionList.add(nums1[i]);
                    i++;
                    j++;
                } else {
                    i++;
                }
            } else {
                if (nums1[i] != nums2[j]) {
                    j++;
                } else if (nums1[i] == nums2[j]) {
                    intersectionList.add(nums1[i]);
                    i++;
                    j++;
                }
            }
        }

        int[] intersection = new int[intersectionList.size()];

        for (int k = 0; k < intersectionList.size(); k++) {
            intersection[k] = intersectionList.get(k);
        }

        return intersection;
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
}

