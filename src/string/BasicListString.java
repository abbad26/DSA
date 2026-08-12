package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicListString {
    public static void main(String[] args) {
        ArrayList<Character> str = new ArrayList<>(Arrays.asList(
                'a','b','b','a','d'
        ));

        //reverseString(str);
        reverseStringTwo(str);
        for (char c : str) {
            System.out.print(c);
        }
    }

    // s = ['a','b','b','a','d'] -> abbad
    // output -> dabba
    static void reverseString(List<Character> s){

                int n = s.size();
                // duplicate list to store reversed elements
                List<Character> duplicateS = new ArrayList<>(n);
                // initializing duplicates
//                for (int i = 0; i < n; i++) {
//                    duplicateS.add(' ');
//                }
                // Copy elements from original list to duplicateS in reverse order
                for (int i = 0; i < n; i++) {
                   // duplicateS.set(i, s.get(n - i - 1));
                    duplicateS.add(s.get(n - i - 1)); //store in reverse order
                }
                // copy back the reverseString to original list
                for (int i = 0; i < n; i++) {
                    s.set(i, duplicateS.get(i));
                }
                // t.c -> O(3*n) -> O(n)
                // s.c -> O(n)
    }


    // two pointer approach
    // t.c -> O(n) , s.c -> O(1)
    static void reverseStringTwo(List<Character> s){
        int left = 0;
        int right = s.size() - 1;

        while (left < right){
            // Swap elements
            Character temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);

            // move pointers
            left++;
            right--;
        }
    }







}

