package pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        SquarePattern ob = new SquarePattern();
        ob.square(n);
    }
}



class SquarePattern {
    public void square(int n) {

        String s = String.valueOf("*").repeat(n);
        for (int i = 1; i<=n; i++){
            System.out.println(s);
        }
        // time - O(n)
//        for (int i =1; i<=n; i++){
//            for (int j = 1; j<=n; j++) {
//                    System.out.print("*");
//            }
//            System.out.println();
//        }

        // time - O(n*n)
    }
}
