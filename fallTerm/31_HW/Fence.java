/******************************************************************************
 * Initial looping problem, then...
 * Represent a fence with a particular number of rails, with supporting posts
 ******************************************************************************/

public class Fence {
    
    // for basic loop practice:
    public static int sumThrough( int upperBound){
        int counter = 1;
        int sum = 0;
        while (counter <= upperBound) {
            sum = sum + counter;

            //update
            counter = counter + 1;
        }

        return sum;
    }
    
    // field(s)
    int rails;
    
    public Fence( int railsParam){
        // System.out.println( "Replace this method body with code to " 
        //                   + "build a fence with " + rails + " sections.");
        rails = railsParam;
    }

    // Produce the output specified in UserOfFence.
    public String toString() { 
        int counter = 0;
        String output = "|";

        while (counter < rails) {

            output = output + "--|";

            //update
            counter = counter + 1;
        }

        return output;
    }
}