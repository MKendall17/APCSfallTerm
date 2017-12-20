// worked with:
// Hanna Yang: hyang6@stuy.edu
// Matthew Kendall: matthewkendall17@gmail.com

public class UserOfTwoDimensions {

	public static void main(String[] args) {

		//creating some test references
		Point p0 = new Point(2.0, 3.0);
		Point p1 = new Point(5.0, 5.0);

		//print some information about them
		System.out.println( "p0: " + p0);
		System.out.println( "X-axis adjoin limit: " + p0.getXaxisAdjoinLimit());
		System.out.println( "Y-axis adjoin limit: " + p0.getYaxisAdjoinLimit());
		System.out.println( "p1 " + p1);
		System.out.println( p0.adjoins(p1));

		//change stuff about p1
		p1.setAdjoinLimit(1.0, 100.0);

		//test adjoining method
		System.out.println(p1.adjoins(p0));
	}
}