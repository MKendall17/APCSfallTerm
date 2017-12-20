public class Coin {
    
    private String name;
    private double value;
    private double probabilityOfHeads;
    private String upface;
    private int flips;
    private int heads;
    
    //constructors

    public Coin(String pname, double probability) {
	name = pname;

	if (pname.equals( "quarter")) {
	    value = .25;
	}
	else if (pname.equals( "dime")) {
	    value = .1;
	}
	else if (pname.equals( "nickel")) {
	    value = .05;
	}
	else if (pname.equals( "penny")) {
	    value = .01;
	}
	if (pname.equals( "dollar")) {
	    value = 1.0;
	}

	probabilityOfHeads = probability;

	upface = "tails";
    }

    public Coin(String pname, double probability, String parupface) {
    	this(pname, probability);

    	if (parupface.equals( "heads") || parupface.equals( "tails")) {
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
    	if (parupface.equals("heads") || parupface.equals("tails")) {
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

    public boolean equals(Coin c1) {
    	return upface.equals(c1.upface);
    }

}
