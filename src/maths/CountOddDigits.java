package maths;

public class CountOddDigits {

    public static void main(String[] args) {
        //System.out.println(oddDigitCount(15));
       // System.out.println(oddDigitInRange(2,9));
       // System.out.println(reverseNumber(2584));
        System.out.println(palindromeNumber(121));
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
}
