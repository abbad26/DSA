package maths;

public class CountOddDigits {

    static int oddDigitCount(int num){
        int countOdd = 0;

        while (num > 0){
            int remainder = num % 10;
            if (remainder % 2 == 1 ) countOdd++;

            num = num / 10;
        }
        return  countOdd;
    }
    public static void main(String[] args) {
        System.out.println(oddDigitCount(15));
    }
}
