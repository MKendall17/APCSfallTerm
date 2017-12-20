public class Student {
    public String firstName;
    public        int osis;
    public static int nextOsis;
    
    // track Student's sleep habits
    public int sleepHours;
    
    // constructors
    public Student() {
        osis = nextOsis;
        nextOsis = nextOsis + 1;
    }
    public Student( String nameParam ) {
        this();
        firstName = nameParam;
    }
    
    public String toString() {
        return firstName + " " + osis
             + " slept for " + sleepHours;
    }
}

