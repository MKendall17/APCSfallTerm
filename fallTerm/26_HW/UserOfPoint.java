public class UserOfPoint {

	public static void main(String[] args) {
		Point p0 = new Point(1.0,2.0);
		Point p1 = new Point(1.0,4.0);

		System.out.println(p0);

		//The distance between points p0, p1 is 2
		System.out.println("Does p0 adjoin p1? " + p0.adjoins(p1));

		//Let's see our adjoining limit
		System.out.println("Adjoining limit: " + p0.getAdjoinLimit());

		//Setting the radius of p0 to be less than the distance
		p0.setAdjoinLimit(1);
		System.out.println("Adjoining limit: " + p0.getAdjoinLimit());
		System.out.println("Does p0 adjoin p1? " + p0.adjoins(p1));
	}
}