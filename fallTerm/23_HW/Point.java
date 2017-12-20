// worked with:
// Hanna Yang: hyang6@stuy.edu
// Matthew Kendall: matthewkendall17@gmail.com

public class Point {
    //fields
    private double rx;
    private double ry;
    private double xcor;
    private double ycor;

    //constructor

    public Point( double x, double y) {
        xcor = x;
        ycor = y;
        rx = 10;
        ry = 20;
    }

    //definitions of distance

    private double distanceX(Point p) {
        return Math.abs(xcor - p.xcor);
    }
    
    private double distanceY(Point p) {
        return Math.abs(ycor - p.ycor);
    }

    public void setAdjoinLimit( double xaxisLimit, double yaxisLimit) {
        /*  Cause this point to remember the EXTENTS ALONG 2 AXES of how
            far away another Point can be, while still being considered
            "in the neighborhood" of this Point.
        */
        
        rx = xaxisLimit;
        ry = yaxisLimit;
    }
    
    public double getXaxisAdjoinLimit() {
        /* Convey the current extent of the neighborhood ALONG THE x AXIS
        */
        
        return rx;
    }
    
    public double getYaxisAdjoinLimit() {
        /* Convey the current extent of the neighborhood ALONG THE y AXIS
        */
        
        return ry;
    }
    
    public boolean adjoins( Point other) {
        /* Convey the true/false value of the boolean statement
           "The other Point is within this Point's neighborhood,
            IN TWO DIMENSIONS."
        */
        
        return (distanceX(other) < rx) ^ (distanceY(other) < ry);
    }

    public String toString() {
        return "( " + xcor + ", " + ycor + ", " + rx + ", " + ry + ")";
    }

    //stuff I needed to add in

    public void setAdjoinLimit( double r) {
        /*  Cause this point to remember the limit of how
            far away another can be and still be considered
            "in the neighborhood"
        */
        
            //changing circular to manhattan distance

        rx = r;
        ry = r;
    }
    
    public double getAdjoinLimit() {
        double average = (rx + ry)/2 ;
        return average;
    }
    
}

