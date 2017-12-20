public class Point {
    public double xcor;
    public double ycor;
    public double findManhattanDistance() {
        double distance = xcor + ycor;
        return distance;
    }

    // Most Important Location
    public static double milXcor;
    public static double milYcor;
 
    public static String
    describeMil() {
        return "(" + milXcor + "," + milYcor + ")";
    }
 
    public
    /* pertains to each instance, so no "static"  */
    double
    milManhattanDistance() {
        double distance = Math.abs( xcor - milXcor) +
                          Math.abs( ycor - milYcor);
        return distance;
    }

    public String toString() {
        // returning current point and mil
        return "Current point: (" + xcor + "," + ycor 
        + ") \n Current mil: (" + milXcor + "," + milYcor + ")";
    }

    // testing code removed. In practice, I would definitely
    // leave it for future use. For this demo, removing it
    // shortens the listing, improving legibility.

    public static void main(String[] args) {
        Point bob = new Point();


        bob.xcor = 1.0;
        bob.ycor = 2.0;

        milXcor = 3.0;
        milYcor = 4.0;


        System.out.println(bob);
        System.out.println(bob + " A String!");
        System.out.println(bob.toString());
    }
}