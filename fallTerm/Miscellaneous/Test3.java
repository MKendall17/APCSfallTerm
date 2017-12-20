public class Test3 {

	private int a;

	public static final String s2 = "hi";

	public static void main(String[] commandLine) {
		String s = "blah blah43 OH NO!";


		System.out.println(s.length());
		System.out.println(s.indexOf("a",2));
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,18));
		System.out.println(s.substring(4,4));

		int totalSum = 0;

		// for (String spar : commandLine) {
		// 	int i = Integer.parseInt(spar);
		// 	totalSum += i;
		// }

		System.out.println(totalSum);

		String[] array = new String[14];
		System.out.println(array[2]);

		// s2 = "no";
		int a = 5;

		System.out.println(a--);
		System.out.println(--a);

		for (String word : commandLine) {
			if (word.equals("you")) {
				System.out.print("FUCK YOU ");
			}
			int l = word.length();
			if (word.substring(l-1,l).equals(".")) {
				System.out.print(word + " ");
				System.out.println();
			}
			else {
				System.out.print(word + " ");
			}
		}

		String reverseString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverseString += s.substring(i,i+1);
		}

		System.out.println(reverseString);

		double d = Math.random();

		Test3 t0 = new Test3();

		System.out.println(t0.thing(123));

	}

	private int thing(int a) {
		this.a = a;
		return a;
	}

	
}