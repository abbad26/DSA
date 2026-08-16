package recursion;

public class BasicRecursion {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
       // System.out.println(sumOfNNumber(10));
       // System.out.println(factorialOfN(5));
       // System.out.println(getArraySum(arr));
        System.out.println(fib(6));
    }


    // sum of natural number
    static int sumOfNNumber(int n){
        if (n == 0)return 0;
        return n + sumOfNNumber(n-1);
    }

    // factorial of n number
    // 5! = 5*4*3*2*1 = 120
    static int factorialOfN(int n){
        if (n == 0 || n == 1) return 1;
        return n*factorialOfN(n-1);
    }

    // sum of array elements
    static int getArraySum(int[] nums){
        return arraySum(nums, 0);
    }

   private static int arraySum(int[] arr, int index){

        if (index == arr.length) return 0;

        return arr[index] + arraySum(arr, index + 1);
    }

    // fibonacci = 0,1,1,2,3,5,8...
    // n = 3 , fib(3) -> fib(3-1)+fib(3-2) -> 1+1 = 2
    static int fib(int n){
        if (n <= 1) return n;

        return fib(n-1) + fib(n-2);
    }
}
