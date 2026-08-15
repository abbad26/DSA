package recursion;

public class BasicRecursion {
    public static void main(String[] args) {

       // System.out.println(sumOfNNumber(10));
        System.out.println(factorialOfN(5));
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
//    static int arraySum(int[] nums){
//
//    }
}
