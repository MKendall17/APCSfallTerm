public class UserOfStats {

	//test the methods
	public static void main(String[] args) {
		//real testing
		int a = 2;
		int b = 3;
		int x = 152145;
		double c = 4.0;
		double d = 5.0;
		double y = 24.1;

		System.out.println("arithmetic means:");
		System.out.println(Stats.mean(a,b));
		System.out.println(Stats.mean(a,x));
		System.out.println(Stats.mean(b,x));
		System.out.println(Stats.mean(c,d));
		System.out.println(Stats.mean(c,y));
		System.out.println(Stats.mean(d,y) + "\n");

		System.out.println("maximums:");
		System.out.println(Stats.max(a,b));
		System.out.println(Stats.max(a,x));
		System.out.println(Stats.max(b,x));
		System.out.println(Stats.max(a,b,x));
		System.out.println(Stats.max(c,d));
		System.out.println(Stats.max(c,y));
		System.out.println(Stats.max(d,y));
		System.out.println(Stats.max(c,d,y) + "\n");

		System.out.println("geometric means:");
		System.out.println(Stats.geoMean(a,b));
		System.out.println(Stats.geoMean(a,x));
		System.out.println(Stats.geoMean(b,x));
		System.out.println(Stats.geoMean(a,b,x));
		System.out.println(Stats.geoMean(c,d));
		System.out.println(Stats.geoMean(c,y));
		System.out.println(Stats.geoMean(d,y));
		System.out.println(Stats.geoMean(c,d,y));
	}
}