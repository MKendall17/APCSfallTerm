public class HW08 {

    public static void main(String[] args) {
	greet("BobJoe");

		}

    public static void greet(String person) {
	    
	System.out.println("hello, " + person + "! How are you doon?");
    }
}

/* The greet method can only be used after the main method is closed.  When put inside the main method, the console displays multiple errors.  It should also not be placed before or after the public class, which in this case is HW08. */
