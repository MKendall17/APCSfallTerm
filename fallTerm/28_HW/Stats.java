public class Stats {

	//methods

	public static int mean( int a, int b) {
		return (a+b)/2;
	}

	public static double mean( double a, double b) {
		return (a+b)/2;
	}

	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		}

		else return b;
	}

	public static double max(double a, double b) {
		if (a >= b) {
			return a;
		}

		else return b;
	}

	public static int geoMean(int a, int b) {
		//we need to make sure return value is int
		int g = (int) Math.sqrt(a*b);
		return g;
	}

	public static double geoMean(double a, double b) {
		//we need to make sure return value is int
		return Math.sqrt(a*b);
	}

	public static int max(int a, int b, int c) {
		if (c > max(a,b)) {
			return c;
		}
		return max(a,b);
	}

	public static double max(double a, double b, double c) {
		if (c > max(a,b)) {
			return c;
		}
		return max(a,b);
	}

	public static int geoMean(int a, int b, int c) {
		int g = (int) Math.pow(a*b*c , 1./3);
		return g;
	}

	public static double geoMean(double a, double b, double c) {
		double g = Math.pow(a*b*c , 1./3);
		return g;
	}

}