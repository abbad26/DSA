package pattern;

public class Patterns {
    public static void main(String[] args) {

//        NumberTrianglePattern(4);
//        NumberSeriesTrianglePattern(5);
        //inverseTrianglePattern(4);
        //inverseNumberTrianglePattern(5);
       // pyramidPattern(4);
        //inversePyramidPattern(4);
        zeroOneTriangle(5);
    }
    // n -> number of line to be printed (row)
    /* 1
       12
       123    */
   static void NumberTrianglePattern(int n){
        for (int i = 1; i<=n; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* 1
       22
       333 */
    static void NumberSeriesTrianglePattern(int n){
        for (int i = 1; i<=n; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /* ***
       **
       *   */
    static void inverseTrianglePattern(int n){
        for (int i = 1; i <= n; i++){
            //for (int j = i; j <= n; j++){
            for (int j = 1; j <= n - i +1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 123
       12
       1
     */
    static void inverseNumberTrianglePattern(int n){
        for (int i = 1; i<=n; i++) {
            for (int j =1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* *
      ***
     *****
    *******
     */
    static void pyramidPattern(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++){
                System.out.print("*");
            }
            for (int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void inversePyramidPattern(int n){
        for (int i = 0; i<=n-1; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*n-2*i-1); j++){
                System.out.print("*");
            }
            for (int j = 1; j<= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void zeroOneTriangle(int n){
        for (int i = 0; i<n; i++) {
            int start = 1;
            if (i%2==0) start = 0;
            for (int j = 0; j<=i; j++){
                System.out.print(start);
                if (i != j) System.out.print(" ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}


