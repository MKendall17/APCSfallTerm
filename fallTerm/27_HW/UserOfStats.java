public class UserOfStats {

	//test the methods
	public static void main(String[] args) {

		//test out stuff here
		System.out.println(Stats.mean(2,3));
		System.out.println(Stats.mean(2.0,3.0));

		//for my own interest
		System.out.println(Stats.mean(2.0,3));

		//real testing
		int a = 2;
		int b = 3;
		double c = 4.0;
		double d = 5.0;

		System.out.println("arithmetic means:");
		System.out.println(Stats.mean(a,b));
		System.out.println(Stats.mean(c,d) + "\n");

		System.out.println("maximums:");
		System.out.println(Stats.max(a,b));
		System.out.println(Stats.max(c,d) + "\n");

		System.out.println("geometric means:");
		System.out.println(Stats.geoMean(a,b));
		System.out.println(Stats.geoMean(c,d));
	}
}