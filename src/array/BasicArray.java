package array;

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
        System.out.println(checkSortedArray(arr, n));
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
