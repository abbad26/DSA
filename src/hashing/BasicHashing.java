package hashing;

public class BasicHashing {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {5,4,3,3,1,5,3,7};
       // System.out.println(frequencyArray(arr, 5, n));
      //  System.out.println(mostFrequentElement(arr));
        System.out.println(secondMostFrequentElement(arr));
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

    // Input: nums = [4, 4, 5, 5, 6]
    // Output: 4
    // Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
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
        int mostFrequent = 0, secMostFreq = 0;
        int maxFrequency = -1, secMaxFreq = -1;
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

    // Second highest occurring element
    // Input: arr = [4, 4, 5, 5, 6, 7]
    //
    //Output: 6
    //
    //Explanation:
    //
    //Both 6 and 7 appear second most times, but 6 is smaller.
    static int secondMostFrequentElement(int[] nums){
        int max = nums[0];
        int maxFreq = 0, secMaxFreq = 0;
        int maxElement = -1, secMaxElement = -1;

        for (int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int[] hash = new int[max +1];
        for (int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        for (int i = 0; i < max; i++){
            int count = hash[i];

            if (count == 0) continue;

            if (count > maxFreq) {
                secMaxFreq = maxFreq;
                maxFreq = count;
                secMaxElement = maxElement;
                maxElement = i;
            }else if(count == maxFreq) {
                maxElement = Math.min(maxElement, i);
            }
            else if(count > secMaxFreq) {
                secMaxFreq = count;
                secMaxElement = i;
            }
            else if(count == secMaxFreq) {
                secMaxElement = Math.min(secMaxElement, i);
            }

        }
        return secMaxElement;
    }
}
