public class PascalsTriangle {

    /** @return a 2-D array containing the first @rows rows of
     *  Pascal's triangle, computing each number from... 
     *  o  1's on the ends of the rows
     *  o  otherwise, the sum of the numbers "above" it
     *  See http://mathforum.org/dr.math/faq/faq.pascal.triangle.html
     */
    private static int[][] pascalsTriangle( int rows) {
        // // demo creating rows of different lengths
        // // by hard-coding values for 3 rows of Pascal's Triangle
        
        // int[][] t = new int[3][]; // row length is not specified here

        // t[0] = new int[1];  // length of row 0 --> 1
        // t[0][0] = 1;
        
        // t[1] = new int[2];  // length of row 1 --> 2
        // t[1][0] = t[1][1] = 1;

        // t[2] = new int[3];  // length of row 2 --> 3
        // t[2][0] = t[2][2] = 1;
        // t[2][1] = 2;
        
        // return t;

        int[][] t = new int[rows][];

        for (int row = 0; row < rows; row++) {
            t[row] = new int[row + 1];
            for (int i = 0; i < t[row].length; i++) {
                if (i == 0 || i == t[row].length - 1) {
                    t[row][i] = 1;
                }
                else {
                    t[row][i] = t[row-1][i-1] + t[row-1][i];
                }
            }
        }

        return t;
    }

    
    public static void main(String [] args) {
        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(0)));
        /* expecting
            1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(1)));
        /* expecting
            1
            1 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(2)));
        /* expecting
            1
            1 1
            1 2 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(3)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(4)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
         */

        System.out.println( TwoDimArray.toString_2d_forEach( pascalsTriangle(100)));
        /* expecting
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
            1 5 10 10 5 1
         */
    }
}//end class TwoDimArray