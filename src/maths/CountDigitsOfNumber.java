package maths;

import java.util.Scanner;

public class CountDigitsOfNumber {
   static int digitCount(int num){
        int count = 0;
        if (num == 0) return 1;
        while (num != 0){
            num = num / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int result =  digitCount(num);
        System.out.println(result);
    }
}
