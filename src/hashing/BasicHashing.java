package hashing;

public class BasicHashing {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {3,5,2,1,5,3,7};
        System.out.println(frequencyArray(arr, 5, n));
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
}
