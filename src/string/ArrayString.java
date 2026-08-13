package string;

import java.awt.datatransfer.StringSelection;

public class ArrayString {
    public static void main(String[] args) {
        char[] s = {'a','b','b','a','d'};
//        reverseString(s);
//        System.out.println(s);

        String str = "racecar";
//        palindromeString(str);
//        if (!palindromeString(str)){
//            System.out.println(str+ " is not a palindrome");
//        }else {
//            System.out.println(str+ " is a palindrome");
//        }

        String strNum = "00546456";
        System.out.println(largestOddNum(strNum));
    }

    // s = ['a','b','b','a','d'] -> abbad
    // output -> dabba
    // using two pointer approach
    static void reverseString(char[] s){

        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }


    // Palindrome
    // s = "racecar"
    static boolean palindromeString(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // s = "0045876 -> to find odd last digit must be an odd digit
    // oddNum -> 5, 45, 7,87,587,4587
    // largest oddNum -> 4587

    static String largestOddNum(String s){
        int j = -1;
        int n = s.length();

        for (int i = n-1; i > 0; i--){
            if ((s.charAt(i) - '0')%2 == 1) {
                j = i;
                break;
            }
        }

        if (j == -1) return " ";

        int i = 0;
        while (i < n){
            if (s.charAt(i) != '0') break;
            i++;
        }
        return s.substring(i, j+1);
    }
}
