package recursion;

import java.util.ArrayList;

public class BasicRecursion {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
       // String s = "Hello";
        ArrayList<Character> s = new ArrayList<>();
        s.add('f');
        s.add('l');
        s.add('y');
       // System.out.println(sumOfNNumber(10));
       // System.out.println(factorialOfN(5));
       // System.out.println(getArraySum(arr));
       // System.out.println(fib(6));
       // System.out.println(reverseString(s));
       // System.out.println(palindrome("hannah"));

        int num = 436;
        //System.out.println(checkPrime(num));
        System.out.println(addDigits(num));
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

    // print nth fibonacci number
    // fibonacci = 0,1,1,2,3,5,8...
    // n = 3 , fib(3) -> fib(3-1)+fib(3-2) -> 1+1 = 2
    static int fib(int n){
        if (n <= 1) return n;

        return fib(n-1) + fib(n-2);
    }

    // reverse of string
    // s = "hello" -> "olleh"

    static ArrayList<Character> reverseString(ArrayList<Character> s){

        int left = 0;
        int right = s.size()-1;
        reverseStr(s,left, right);
        return s;
    }

    // to swap character
    static private void reverseStr(ArrayList<Character> s, int left, int right){
        // base
        if (left >= right) return;

        // swap character
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverseStr(s, left+1, right-1);
    }

    // palindrome

    static boolean palindrome(String s) {
        return isPalindrome(s, 0, s.length()-1);
    }


    static private boolean isPalindrome(String s, int left, int right){
        if (left >= right) return true;

        if (s.charAt(left) != s.charAt(right)) return false;

        return isPalindrome(s, left+1, right-1);
    }


    // check prime number

    static boolean checkPrime(int num){
        if (num <= 1) return false;

        return isPrime(num, 2);
    }
    static boolean isPrime(int num, int i){
        if (i > Math.sqrt(num)) return true;

        if (num % i == 0) return false;

        return isPrime(num, i + 1);
    }


    // sum of digits
    // Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
    // n = 326 -> 3+2+6 -> 11 ->1+1 -> 2 return

    static int addDigits(int num){
        if (num < 10){
            return num;
        }
        int sum = 0;
        while (num != 0){
            sum = sum + (num%10);
            num /= 10;
        }

        return addDigits(sum);
    }
}
