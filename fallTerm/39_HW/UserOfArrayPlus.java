public class UserOfArrayPlus {
    public static void main(String[] commandLine) {
        // // problem 1
        // ArrayPlus randomness = new ArrayPlus( 16);
        // System.out.println( randomness);

        // problem 2, after commenting out above
        ArrayPlus randomness = new ArrayPlus( 16, 4);
        System.out.println( "Initial list: \n" + randomness);

        // System.out.println(randomness.indexOf(3));

        // problem 4
        /* Construct an ArrayPlus that will be used 
         * to garner frequency data.
         */         
        ArrayPlus freqsForHistogram = new ArrayPlus( 4);
        
        /* Pass freqsForHistogram to a method in the
         * ArrayPlus class that can populated it.
         */
        randomness.freqFill( freqsForHistogram);

        // See the histogram data:
        System.out.println( "Frequencies: \n" + freqsForHistogram);
    }
}

