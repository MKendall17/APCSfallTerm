public class UserOfCoin {

    public static void main(String[] args) {

	Coin bruce = new Coin("dime", 0.3);
	System.out.println("bruce: " + bruce);
	Coin wayne = new Coin("quarter", 0.7, "heads");
	System.out.println("wayne: " + wayne);

	bruce.flip();
	wayne.flip();
	
	System.out.println("\nAfter flipping...");
	System.out.println("bruce: " + bruce);
	System.out.println("wayne: " + wayne);

	if (bruce.equals(wayne)) 
	    System.out.println("A match!");
	else
	    System.out.println("No match");


	//testing overloaded flip
    bruce.flip(10000);
    System.out.println("bruce: " + bruce);

    //testing while style factorial
    System.out.println(Coin.factorial_whileStyle(3));
    System.out.println(Coin.factorial_whileStyle(5));
	System.out.println(Coin.factorial_whileStyle(10));

	//testing recursive style factorial
	System.out.println(Coin.factorial_recursive(3));
	System.out.println(Coin.factorial_recursive(5));
	System.out.println(Coin.factorial_recursive(10));
    }
}