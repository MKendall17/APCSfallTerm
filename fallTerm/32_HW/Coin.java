public class Coin {

    private String name;
    private double value;
    private String upFace;
    private int flips;
    private int heads;
    private double probabilityOfHeads;

    public Coin(String called, double probHeads) {
        name = called;
	probabilityOfHeads = probHeads;
	valueGen(called);
	upFace = "heads";
    }

    private void valueGen(String referent) {
	if (referent.equals("quarter"))
	    value = 0.25;
	else if (referent.equals("dime"))
	    value = 0.10;
	else if (referent.equals("nickel"))
	    value = 0.05;
	else if (referent.equals("penny"))
	    value = 0.01;
	else
	    value = 0.00;
    }

    public Coin(String referent, double probHeads, String Face) {
	this(referent, probHeads);
	if (Face.equals("tails") || Face.equals("heads"))
	    upFace = Face;
    }

    public String toString() {
	return name + " has " + flips + " flips and " + heads + " heads";
    }

    public void setUpFace(String side) {
	if (side.equals("tails") || side.equals("heads"))
	    upFace = side;
    }

    public void flip() {
	flips = flips + 1;
	if (Math.random() < probabilityOfHeads) {
	    upFace = "heads";
	    heads = heads + 1;
	}
	else {
	    upFace = "tails";
	}
    }

    public boolean equals(Coin other) {
	return upFace.equals(other.upFace);
    }

    public int getFlips() {
	return flips;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return flips - heads;
    }

    public double flip( int times) {
    	int counter = 0;
    	int numberOfHeads = 0;

    	while (counter < times) {
    		int previousHeads = heads;

    		flip();

    		if (heads - numberOfHeads > 0) {
    			numberOfHeads = numberOfHeads + 1;
    		}

    		counter = counter + 1;

    	}

    	return numberOfHeads;
    }

    public static int factorial_whileStyle(int n) {
    	int product = 1;
    	int counter = 1;

    	while (counter <= n) {
    		product = product * counter;
    		counter = counter + 1;
    	}

    	return product;
    }

    public static int factorial_recursive(int n) {
    	if (n == 0) {
    		return 1;
    	}

    	else {
    		return n * factorial_recursive(n-1);
    	}
    }

}