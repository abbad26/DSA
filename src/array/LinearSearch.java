package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,-3,7};
        int target = -3;

        int result = linearSearch(arr, target);
        System.out.println("Element "+target+" found at index: " +result);
    }

    static int linearSearch(int[] arr, int target){

        int n = arr.length;

        for (int i = 0; i < n ; i++){
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
