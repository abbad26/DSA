package string;

public class ArrayString {
    public static void main(String[] args) {
        char[] s = {'a','b','b','a','d'};

        String str = "racecar";

//        reverseString(s);
//        System.out.println(s);

        palindromeString(str);
        if (!palindromeString(str)){
            System.out.println(str+ " is not a palindrome");
        }else {
            System.out.println(str+ " is a palindrome");
        }
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
}
