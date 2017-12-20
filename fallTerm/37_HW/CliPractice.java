public class CliPractice {

	public static void main(String[] commandLine) {

		double sum = 0;
		String name = "";
		boolean switch0 = true;
		int token = 0;

		for (String option : commandLine) {
			if (option.equals("Bondify") && switch0 == true) {
			}

			else if (switch0 == true && token > 0) {

				String namePar = "";
				int length = option.length();
				int numberOfMarkers = NumberOf(option, " ");
				int lastMarker = option.indexOf(" ", numberOfMarkers);
				String lastName = option.substring(lastMarker+1);

				//# of markers is 0

				//look at last marker

				String sp = "";

				name += lastName + ", " + option;
				System.out.println(lastMarker);
				System.out.println(numberOfMarkers);

			}

			else {
				switch0 = false;
				sum += Double.parseDouble(option);
			}

			token = 1;
		}

		System.out.println("" + sum);
		System.out.println(name);
		System.out.println(NumberOf("wd a wa ", " "));
		System.out.println("wd a daw sd".indexOf(" ", 2))


		//When using non-ints or doubles, one gets the error:

		// Exception in thread "main" java.lang.NumberFormatException: For input string: "hi"
		// 	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
		// 	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
		// 	at java.lang.Double.parseDouble(Double.java:538)
		// 	at CliPractice.main(CliPractice.java:9)
	}

	public static int NumberOf(String s, String a) {
		int inc = 0;
		int result = 0;
		int length = s.length();

		while (inc < length) {
			if (s.substring(inc, inc + 1).equals(a)) {

				result += 1;
				
			}

			inc += 1;
		}

		return result;
	}

}