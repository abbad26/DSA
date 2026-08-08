package hashing;

public class BasicHashing {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {5,4,3,1,5,3,7};
       // System.out.println(frequencyArray(arr, 5, n));
        System.out.println(mostFrequentElement(arr));
    }


    // to check the frequency of numbers in an array

    static int frequencyArray(int arr[], int num, int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == num){
                count++;
            }
        }
        return count;
    }
    // if we want the frequency of every element
    // we have to search entire array for every element
    // function will run num times.
   // Every time it checks the whole array.
    // T.C -> O(n^2)
    // to overcome this we can use array

    static int mostFrequentElement(int[] nums){
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < nums.length; i++ ){
            max = Math.max(max, nums[i]);
        }
        // hash array
        int[] hash = new int[max +1];
        for (int i = 0 ; i < nums.length; i++){
            hash[nums[i]]++; // store frequency
        }
        int mostFrequent = 0;
        int maxFrequency = 0;
        for (int i = 0; i <= max; i++) {
            // to find the highest frequency
            if (hash[i] > maxFrequency) {
                maxFrequency = hash[i];
                mostFrequent = i;
            }
        }
        return mostFrequent;
    }
    // T.C -: o(n)+O(n)+O(m) -> O(n+m)
    // S>C -: O(max)
}
