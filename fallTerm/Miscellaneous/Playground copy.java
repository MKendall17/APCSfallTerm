public class Playground {

      //We write all our code in the main function

	public static void main(String[] args) {

            //SET a loctation for the mil
            Point.milxcor = 4;
            Point.milycor = 5;

            //NOTE: The ints become doubles because they were defined that way 


            //NEW instance of the point class (with all the fields in point)
            Point fountain = new Point();

            //First quadrant
            fountain.xcor = 22;
            fountain.ycor = 30;

            //Test our results
            System.out.println("This is fountain's xcor: " + fountain.xcor);
            System.out.println("This is fountain's ycor: " + fountain.ycor);

            //We print mil and find the mil distance 
            System.out.println("Most important location: " + Point.describeMil());
            System.out.println("This is the fountain mildistance: " + 
                  fountain.milManhattanDistance()); 
            //Make SURE you refer to fountain because it is NOT static
            //Now we do the others

            Point fountain2 = new Point();
            Point fountain3 = new Point();

            fountain2.xcor = -3;
            fountain2.ycor = -2;

            fountain3.xcor = -4;
            fountain3.ycor = 12;

            System.out.println("This is the fountain2 mildistance: " + 
                  fountain2.milManhattanDistance()); 
            System.out.println("This is the fountain3 mildistance: " + 
                  fountain3.milManhattanDistance()); 


  }
}