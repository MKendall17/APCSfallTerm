public class Coin {
    
    public String name;
    public double value;
    private double probabilityOfHeads;
    private String upface;
    private int flips;
    private int heads;
    
    //constructors

    public Coin(String pname, double probability) {
	name = pname;

	if (pname == "quarter") {
	    value = .25;
	}
	else if (pname == "dime") {
	    value = .1;
	}
	else if (pname == "nickel") {
	    value = .05;
	}
	else if (pname == "penny") {
	    value = .01;
	}
	if (pname == "dollar") {
	    value = 1.0;
	}

	probabilityOfHeads = probability;

	upface = "tails";
    }

    public Coin(String pname, double probability, String parupface) {
    	this(pname, probability);

    	if (parupface == "heads" || parupface == "tails") {
    		upface = parupface;
    	}
    }

    //methods

    public String flip() {
    	if (Math.random() < probabilityOfHeads) {
    		flips = flips + 1;
    		heads = heads + 1;
    		return "heads";
    	}

    	flips = flips + 1;
    	return "tails";
    }

    //mutators

    public void setUpFace(String parupface) {
    	if (parupface == "heads" || parupface == "tails") {
    		upface = parupface;
    	}
    	else {
    		System.out.println("You did not pick one of heads or tails");
    	}
    }

    //accessors

    public int getFlips() {
    	return flips;
    }

    public int getHeads() {
    	return heads;
    }

    public int getTails() {
    	return flips - heads;
    }


    //the toString method

    public String toString() {
    	return "Name: " + name + ", Value: " + value 
    	+ ", Probability Of Heads: " + probabilityOfHeads
    	+ ", Current Face: " + upface
    	+ ", Number of Flips: " + flips
    	+ ", Number of Heads: " + heads;
    }

    //the equals method

    public static boolean equals(Coin c0, Coin c1) {
    	return c0.upface == c1.upface;
    }

}
