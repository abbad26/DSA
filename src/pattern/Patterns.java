package pattern;

import static java.lang.Math.min;

public class Patterns {
    public static void main(String[] args) {

 //      columnSeriesNumberTrianglePattern(4);
//        NumberSeriesTrianglePattern(5);
        //inverseTrianglePattern(4);
        //inverseNumberTrianglePattern(5);
       //pyramidPattern(4);
        //inversePyramidPattern(4);
       // zeroOneTriangle(5);
        //diamondShapePattern(4);
        //halfDiamondPattern(4);
        //numberPalindromePattern(4);
        //increasingNumberPattern(4);
//        alphabetTrianglePattern(5);
//        inverseAlphabetPattern(5);
        //rowSeriesTriangleAlphabetPattern(5);
       // pyramidAlphabetPattern(5);
       // decreasingAlphabetTrianglePattern(5);
        diamondSpacePattern(3);
        //butterflyPattern(5);
        //rectangleStarPattern(5);
        rectangleNumber(5);
    }
    // n -> number of line to be printed (row)
    /* 1
       12
       123    */
   static void columnSeriesNumberTrianglePattern(int n){
       // for Alphabet => char character = 'A'
       //                 char character = 'A'+2 ->
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
    /*
     *******
      *****
       ***
        *
     */
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

    // Diamond Pattern
    /*   *
        ***
       *****
      *******
      ******* to exclude this line -> lower i=n-1
       *****
        ***
         *
     */   // follow the symmetry of both pyramid or

    static void diamondShapePattern(int n){
        // upper half
        for (int i =1; i<=n; i++){
            for (int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*  Half Diamond pattern
         *
         **
         ***
         ****
         ***
         **
         *
     */  // check symmetry -> top Triangle , bottom inverseTriangle(n-1) -> printing one less line

    static void halfDiamondPattern(int n){
        // upper half
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void trianglePattern(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
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
                start = 1-start;   // if start = 0 -> 1-0=1
            }                      // if start = 1 -> 1-1=0,  0 1 0 1 or 1 0 1 0 sequence
            System.out.println();
        }
    }

    // Some other advance pattern
    /*
        1      1
        12    21
        123  321
        12344321
     */
    static void numberPalindromePattern(int n){

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
        1
        2 3
        4 5 6
        7 8 9 10
     */
    static void increasingNumberPattern(int n){
        int currentNumber = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(currentNumber);
                System.out.print(" ");
                currentNumber++;
            }
            System.out.println();
        }
    }
    /*
        A
        AB
        ABC
        ABCD
     */
    static void alphabetTrianglePattern(int n){

        for (int i=1; i<=n; i++){
            //print characters from A to A + i - 1
            for (char ch = 'A'; ch <= 'A'+i-1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
   /*
      ABCD
      ABC
      AB
      A
    */
    static void inverseAlphabetPattern(int n){
        for (int i=n; i>=1; i--){
            //print characters from A to A + i - 1
            for (char ch = 'A'; ch <= 'A'+i-1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
   /*
       A
       BB
       CCC
       DDDD
    */
    static void rowSeriesTriangleAlphabetPattern(int n){
        char ch = 'A';
        for (int i=1; i<=n; i++){
            //print characters from A to A + i - 1
            for (int j = 1; j <= i; j++){
                System.out.print((char) (ch + i-1));
            }
            System.out.println();
        }
    }
    /*
          A
         ABA
        ABCBA
       ABCDCBA
     */

    static void pyramidAlphabetPattern(int n){

        for ( int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
                char ch = 'A';
                for (int j=1; j<= (2*i-1); j++){
                    System.out.print(ch);
                    if (i > j) ch = (char)(ch +1);
                    else ch = (char)(ch - 1);
                }
            System.out.println();
        }
    }
    /*
         E
         DE
         CDE
         BCDE
         ABCDE
     */
    static void decreasingAlphabetTrianglePattern(int n){
        char element = (char)('A'+n-1);
        for (int i = 1; i <= n; i++){
            for (char ch =(char)(element-i+1); ch <= element; ch++){
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        ******
        **  **
        *    *
        *    *
        **  **
        ******
     */
    static void diamondSpacePattern(int n){

        // upper half
        for ( int i = 0; i < n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
        *      *
        **    **
        ***  ***
        ********
        ***  ***
        **    **
        *      *
     */

    static void butterflyPattern(int n){

        // upper half
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for ( int i = 1; i < n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        *****
        *   *
        *   *
        *   *
        *****
     */

    static void rectangleStarPattern(int n){
        for (int i = 1; i <= n; i++){
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <= n; j++){
                    if (j == 1 || j ==n) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
/*   n = 4
     0123456
   0 4444444
   1 4333334
   2 4322234
   3 4321234
   4 4322234
   5 4333334
   6 4444444
     cell(i, j) -> (3,4) -> element = 2
     top = i = 3
     bottom = 2*n-2-i -> 2*4-2-3 = 3
     left = j = 4
     right = 2*n-2-j -> 2*4-2-4 = 2
     element = (n - min(min(top, bottom), min(left, right)))
             = (4-min(min(3,4),min(4,2)))
             =(4-min(3,2))
             = 4-2=> 2 = element at (3,4)
 */


    static void rectangleNumber(int n){
        int size = 2 * n - 2;
        for (int i = 0; i <= size; i++){
            for (int j = 0; j <= size; j++){
                // Distance of the current cell from all four edges
                int top = i, bottom = (size) - i, left = j, right = (size) - j;
                //minimum distance from any edge
                int minDistance = min(min(top, bottom), min(left, right));

                System.out.print(n - minDistance);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}


