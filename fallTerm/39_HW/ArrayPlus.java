public class ArrayPlus {

	private int[] refToArray;
	// private int max;

	//constructors

	public ArrayPlus(int capacity) {

		refToArray = new int[capacity]; //the values will all initially have value 0

	}

	public ArrayPlus(int capacity, int maxRandom) {

		refToArray = new int[capacity];
		// max = maxRandom;

		for (int i = 0; i < refToArray.length; i++) {
			int randInt = (int) (maxRandom * Math.random());

			refToArray[i] = randInt;
		}
	}

	public String toString() {

		String output = "";

		for (int i = 0; i < refToArray.length; i++) {
			output += "" + i + ": " + refToArray[i] + "\n";
		}

		return output;
	} 

	//methods

	public int indexOf(int findMe) {

		for (int i = 0; i < refToArray.length; i++) {

			if (refToArray[i] == findMe) {
				return i;
			}
		}

		return -1;
	}

	public ArrayPlus freqFill( ArrayPlus freqs) {

		for (int i = 0; i < refToArray.length; i++) {

			int number = refToArray[i];

			freqs.refToArray[number] += 1;
		}

		return freqs;
	}

}