public class TestString {

	public static void main(String[] args) {

		String sand = "bar";
	// "b" is at index 0
	// "a" is at index 1
	// "r" is at index 2
	System.out.println( sand.length()        + " ...expecting 3");
	System.out.println( sand.substring(0,2)  + " ...expecting \"ba\" ");
	System.out.println( sand.substring(0,3)  + " ...expecting \"bar\" ");
	//System.out.println( sand.substring(0,4)  + " ...expecting \"ERROR\"");  --it is an error
	System.out.println( sand.substring(1,2)  + " ...expecting \"a\"");
	System.out.println( sand.substring(1,1)  + " ...expecting \"\"");
	System.out.println( sand.substring(1)    + " ...expecting \"ar\"");
	// System.out.println( sand.substring(1,7)  + " ...expecting \"ERROR\""); --it is an error
	// System.out.println( sand.substring(7)    + " ...expecting \"ERROR\"");  --it is an error

	System.out.println(reverse_whileStyle("racecar"));
	System.out.println(reverse_whileStyle("matthew"));
	System.out.println(reverse_whileStyle(""));
	}


	//methods

	public static String reverse_whileStyle(String s) {

		int counter = s.length() - 1;
		String result = "";

		while (counter >= 0) {

			result = result + s.charAt(counter);
			counter--;
		}

		return result;
	}
}