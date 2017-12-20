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

    //below is the constructor, setting default values for objects.
    public Point() {
        xcor = 5;
        ycor = 7.3;
    }

    //we add an overloaded constructor
    public Point(double dsp_x, double dsp_y) {
        xcor = milXcor + dsp_x;
        ycor = milYcor + dsp_y;
    }

    public Point(Point p) {
        //reflection over line y=x
        xcor = p.ycor;
        ycor = p.xcor;
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

        //creating new point
        Point p0 = new Point();

        //printing the point without modifying its properties
        System.out.println(p0);

        //creating another point to test overloaded constructor
        Point p1 = new Point(1.3,0.4);

        System.out.println(p1);

        //testing third constructor
        Point p2 = new Point(p0);

        System.out.println(p2);

    }
}