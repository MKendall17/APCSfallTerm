public class UserOfCoin {
  public static void main( String[] args ) {
      

    // ====  future work ====
    
    //test constructor and toString
    Coin bruce = new Coin( new String("put your coin name here"), 0.3 );
    System.out.println("bruce: " + bruce);

    //test another constructor
    Coin wayne = new Coin( new String("another coin name"), 0.7
                         , new String("heads") );
    System.out.println("wayne: " + wayne);

    //test flip() method
    bruce.flip();
    wayne.flip();
    System.out.println("\nAfter flipping...");
    System.out.println("bruce: " + bruce);
    System.out.println("wayne: " + wayne);

    // test equals() method
    if ( bruce.equals(wayne) ) 
        System.out.println( "a match!" );
    else
        System.out.println( "No match" );

    // setUpFace testing
    bruce.setUpFace( "edge");
    bruce.setUpFace( new String("heads"));
    wayne.setUpFace( new String("heads"));
    System.out.println( wayne.equals( bruce) + " ...expecting true");
    wayne.setUpFace( "tails");
    System.out.println( wayne.equals( bruce) + " ...expecting false");
    
    // ====  end of "future work" ====

  } //end  of main()
} //end of class