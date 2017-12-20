public class File1 extends File2 {
		public void printHello() {
  
      	super.printHello();
        System.out.println("Hello from SubClass");
        return;
     }
     public static void main(String[] args) {
       File1 obj = new File1();
       obj.printHello();
    }
}