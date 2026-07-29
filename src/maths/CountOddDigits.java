package maths;

import java.util.ArrayList;

public class CountOddDigits {

    public static void main(String[] args) {
        //System.out.println(oddDigitCount(15));
       // System.out.println(oddDigitInRange(2,9));
       // System.out.println(reverseNumber(2584));
        //System.out.println(palindromeNumber(121));
       // System.out.println(largestDigit(4765));
       // System.out.println(factorial(6));
       // System.out.println(isArmstrong(153));
//        System.out.println(perfectNumber(28));
//        System.out.println(perfectNumberOp(28));
        System.out.println(isPrime(7));

    }


    static int oddDigitCount(int num){
        int countOdd = 0;

        while (num > 0){
            int remainder = num % 10;
            if (remainder % 2 == 1 ) countOdd++;

            num = num / 10;
        }
        return  countOdd;
    }

    // low = 2 , high = 8 -> [2,3,4,5,6,7,8] -> number of odd digits = 3
    static int oddDigitInRange(int low, int high){

//        int oddCount = 0;
//        for (int i = low; i <= high; i++){
//
//            if (i % 2 != 0) oddCount++;
//        }
//        return oddCount;

        int nums = high - low + 1;  //  num=8-2+1 -> 7 / 2 = 3.5 -> 4
        if (low % 2 != 0 && high % 2 != 0) return nums/2 + 1;
        else return nums / 2;
    }

    // Reverse a Number
    // 7532 -> 2357
    static int reverseNumber(int num){
        int revNum = 0;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            revNum = revNum * 10 + rem;
        }
        return revNum;
    }

    // Palindrome number
    // n = 151 , revNum = 151
    // if ( n == revNum ) return true for palindrome
    static boolean palindromeNumber(int num){
        int revNum = reverseNumber(num);
        return num == revNum;
    }

    // largest digit in number
    // num = 5867 -> largestDigit = 8, O(logn)
    static int largestDigit(int num){
        int largest = 0;

        while (num > 0){
            int lastDigit = num % 10;
            if (lastDigit > largest) largest = lastDigit;

            num = num / 10;
        }
        return largest;
    }

    // factorial of a number
    // 4! -> 4*3*2*1 = 24
    // 0! = 1
    static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

    // Check if a number is Armstrong or not
    // num = 153 then 1^3+5^3+3^3 = num -> 153 (true)

    static boolean isArmstrong(int num){
        int sum = 0;
        int digitCount = (int) (Math.log10(num) + 1);
        int duplicateNum = num;

        while (num > 0){
            int lastDigit = num % 10;
            sum = (int) (sum + Math.pow(lastDigit, digitCount));

            num = num / 10;
        }
        return duplicateNum == sum;
    }

    // Perfect Number
    // num = 6 -> Proper Divisor -> 1,2,3 -> sumOfDivisor = 1+2+3 =num , so 6 is a Perfect Number
    static boolean perfectNumber(int num){
        int sum = 0;
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }
        return (sum == num);
    }
    // T.C -> O(n)

    // optimized code
    // O(sqrt(n))
    static boolean perfectNumberOp(int num){
        int sum = 1;
        if (num<=1)return false;
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0){
                sum = sum + i;
                if (i != (num/i)) sum = sum + (num/i);
            }
        }
        return (sum == num);
    }

    // Check Prime number
    static boolean isPrime(int num){

        // T.C -> O(n)
//        if (num == 1) return false;
//        for (int i = 2; i < num; i++){
//            if (num % i == 0) return false;
//        }
//        return true;
        // O(sqrt(n))
        if (num == 1) return false;
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
