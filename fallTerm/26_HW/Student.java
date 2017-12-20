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
             + " slept for " + sleepHours
             + " current state: " + sleepCategory();
    }

    public String sleepCategory() {
        if (sleepHours < 20) {
            return "brain-dead";
        }

        else if (sleepHours < 30) {
            return "a-ok!";
        }

        else if (sleepHours < 40) {
            return "healthy child";
        }

        else {
            return "you clearly don't go to Stuy";
        }
    }

    public void augmentSleepHours( int addendum) {
        if (addendum > 0 ) {
            sleepHours = sleepHours + addendum;
        }

        else {
            System.out.println("I'm afraid that's not gonna work.");
        }
    }
}

