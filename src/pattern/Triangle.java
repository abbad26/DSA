package pattern;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TrianglePattern ob = new TrianglePattern();
        ob.trianglePattern(n);
    }
}


class TrianglePattern {
    public void trianglePattern(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
//                if (i >= j){
                System.out.print("*");
//            }
                }
            System.out.println();
        }
    }
}
