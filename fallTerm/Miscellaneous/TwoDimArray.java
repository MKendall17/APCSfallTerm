/** Practice operations on 2-D arrays.
 *  Based on work by Mr. Brown Mykolyk
 */
 public class TwoDimArray {

    /** postcondition: fill the array @a with consecutive values
     *  from @startingAt, in row-major order
     */
    private static void fill( int[][] a, int startingAt) {
      int row = 0;
      int column = 0;
      int start = 0;
      while (a.length > row) {
        while (a[row].length > column) {
          a[row][column] = startingAt + start;
          startingAt ++;
          column ++;
        }
        column = 0;
        row++;
      }
    }

    /** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a "simple FOR" loop  (not a for-each)
     */
    public static String toString_2d_simpleFor(int[][] a) {
      String end = "";
      for (int row = 0; row < a.length; row++) {
        for (int column = 0; column < a[row].length; column++) {
          end += a[row][column] + " ";
        }
        end += System.lineSeparator();
      }
      return end;
    }

    /** @return a string representation of a 2D integer array @a, with
     *  each row on its own line,
     *  computed using a for-each loop
     *  Declared public because it is used in PascalsTriangle.java
     *  (PascalsTriangle coming soon!)
     */
    public static String toString_2d_forEach( int[][] a ) {
        String end = "";
        for (int[] row : a) {
          for (int number : row) {
            end += number + " ";
          }
          end += System.lineSeparator();
        }
        return end;
    }

    /** @return the sum of all items in 2D int array @a
     *  computed using nested loops.
     */
    private static int sumAll( int[][] a ) {
      int row = 0;
      int column = 0;
      int total = 0;
      while (a.length > row) {
        while (a[row].length > column) {
          total += a[row][column];
          column++;
        }
        column = 0;
        row++;
      }
      return total;
    }

    /** @return the sum of all items in 2D int array @a,
     *  computed using helper methods.
     */
    private static int sumWithHelp( int [][] a ) {
        // Sum half the rows using sumRow_simpleFor.
        // Intepret "half" in the sense of integer division.
        // sum half the rows using sumRow_forEach
        int row = 0;
        int total = 0;
        while (a.length / 2 > row) {
          total += sumRow_simpleFor(row, a);
          row ++;
        }
        while (a.length > row) {
          total += sumRow_forEach(row, a);
          row ++;
        }
        return total;
   }

    /** @return the sum of all items in row rowNumber of 2D integer array @a,
     *  computed using a "simple FOR" loop (not a for-each)
     */
    private static int sumRow_simpleFor( int rowNumber, int[][] a ) {
      int total = 0;
      for (int value = 0; a[rowNumber].length > value; value++) {
        total += a[rowNumber][value];
      }
      return total;
    }

    /** @return the sum of all items in row rowNumber of 2D integer array @a,
     *  computed using a for-each
     */
    private static int sumRow_forEach( int rowNumber, int[][] a){
      int total = 0;
      for (int value : a[rowNumber]) {
        total += value;
      }
      return total;
    }

    public static void main(String [] args) {
        int [][] m0 = new int[3][5];
        System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        // fill( m0, 100);
        // System.out.println( System.lineSeparator() + toString_2d_simpleFor( m0));
        // /* expecting...
               // 100 101 102 103 104
               // 105 106 107 108 109
               // 110 111 112 113 114
         // */       

        // int [][] m1 = { {2,4,6}, {3,5,7} };
        // System.out.println( System.lineSeparator() + toString_2d_simpleFor( m1));
        // int [][] m2 = { {2}, {4,6}, {1,3,5} };
        // System.out.println( System.lineSeparator() + toString_2d_simpleFor( m2));
        
        // System.out.println( System.lineSeparator() + toString_2d_forEach( m0));
        // System.out.println( System.lineSeparator() + toString_2d_forEach( m1));
        // System.out.println( System.lineSeparator() + toString_2d_forEach( m2));
        
        // System.out.println( System.lineSeparator() 
        //                    + "testing sumAll...");
        // System.out.println("sum m0 : " + sumAll(m0) + " expecting 1605");
        // System.out.println("sum m1 : " + sumAll(m1));
        // System.out.println("sum m2 : " + sumAll(m2));

        // System.out.println( System.lineSeparator() 
        //                    + "testing sumWithHelp...");
        // System.out.println("sum m0 : " + sumWithHelp(m0) 
        //                   + " still expecting 1605");
        // System.out.println("sum m1 : " + sumWithHelp(m1));
        // System.out.println("sum m2 : " + sumWithHelp(m2));
        }
}//end class TwoDimArray