public class Student {
    public String firstName;
    public        int osis;
    public static int nextOsis;
    
    /* track a Student's sleep habits
       These "sleep" fields need not be handled by
       constructors because they are set to
       appropriate values under Java's rules 
       for default values for int primitives.
    */
    public int sleepHours;
    public int sleepNights;
    
    /* a no-arg constructor that guarantees 
       that any Student object has a valid osis,
    */
    public Student() {
        // use and update the nextOsis
        osis = nextOsis;
        nextOsis = nextOsis + 1;
    }
    
    /* an overloaded constructor that, 
       in addition to handling the osis,
       also allows a programmer who uses 
       the Student class to set a firstName
       while constructing a Student object 
    */
    public Student( String nameForStudent) {
        // use and update the nextOsis
        osis = nextOsis;
        nextOsis = nextOsis + 1;
        firstName = nameForStudent;
    }
    
    public String toString() {
        return firstName + " " + osis;
    }
    

    public static void main(String[] args) {
        System.out.println(); // space makes neatness
        
        // occupant of seat 0
        Student s0 = new Student(); // no-arg constructor invoked
        s0.firstName = "Brian";
        System.out.println( s0 );

        // occupant of seat 1
        Student s1 = new Student( "Mr. Dyrland-Weaver");
              // demonstrates the overloaded 1-argument constructor
        System.out.println( s1 );
    }
}