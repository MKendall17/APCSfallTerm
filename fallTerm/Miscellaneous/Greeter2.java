public class Greeter2 { 
	public static void main(String[] args){
		BigSib2.greet("Gib");
		BigSib2.greet("Alison");
		BigSib2.greet("Jimbo");
	}
}
class BigSib2 {
	public static void greet(String name) { 
		System.out.println("hello, freshperson " + name + "! How you doon?");
	} 
}
