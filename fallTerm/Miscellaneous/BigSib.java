public class BigSib {
    public static void main(String[] commandLine) {
       System.out.println( BigSib.greet("Simon") );
       System.out.println( BigSib.greet("Theodore") );
       System.out.println( BigSib.greet("Alvin") );
       System.out.print( BigSib.greet("Simon"));
       System.out.println( BigSib.greet("Theodore"));
       System.out.println( BigSib.greet("Alvin"));
    }
    public static String greet(String person) {
        return "Hi, freshperson " + person + "!";
    }
}
